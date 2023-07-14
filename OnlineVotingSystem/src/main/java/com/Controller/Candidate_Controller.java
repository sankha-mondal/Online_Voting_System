package com.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entity.Candidate_Details;
import com.Entity.Party_Details;
import com.Service.Candidate_Service;

@Controller
public class Candidate_Controller {
	
	@Autowired
	Candidate_Service candidateService;
	
//=============================================================================================================
	
	//  ========================= : Create Candidate-Details Operation: (1) ==========================
	
	// URL:  http://localhost:5082/candidate/add_candidate_details
    @GetMapping("/candidate/add_candidate_details")
    public String add_candidate(Model model) {
    	
        List<Party_Details> lst = candidateService.view_party_list();
        List<String> party_name=new ArrayList<>();
        
        for(Party_Details details:lst) {
            party_name.add(details.getParty_name());
        }
        
       model.addAttribute("party_details", party_name);
       return "add_candidate_details";
    }
    
    
    // URL:  http://localhost:5082/candidate/save_candidate_details
    @PostMapping("/candidate/save_candidate_details")
    public String addCandidateDetails(@RequestParam("party_name")String party_name,
                                      @RequestParam("election_id") int election_id,                             
                                      @RequestParam("candidate_name") String candidate_name,
                                      @RequestParam("mobile_no") String mobile_no,
                                      @RequestParam("addhar_id") String addhar_id,
                                      @RequestParam("age") int age,
                                      @RequestParam("city") String city,
                                      @RequestParam("state") String state,
                                      Model model) {
        
        String msg="";
        char ch=mobile_no.charAt(0);
         
        if(age<25) {
          msg="Candadiate should be greater than 25 years";
          model.addAttribute("msg", msg);
          return "view_status";
        }
        else if(party_name.length()==0) {
          msg="Please Enter valid party name";
          model.addAttribute("msg", msg);
          return "view_status"; 
        }
        else if(mobile_no.length()!=10) {
          msg="Please Enter valid 10 digit number";
          model.addAttribute("msg", msg);
          return "view_status";
        }
        else if(ch>=48&& ch<=53) {
          msg="Mobile number start with 6,7,8,9";
          model.addAttribute("msg", msg);
          return "view_status";
        }
         
       else {
            Candidate_Details details=new Candidate_Details();
            details.setParty_name(party_name);
            details.setElection_id(election_id);
            details.setSname(candidate_name);
            details.setMobile_no(mobile_no);
            details.setAddhar_id(addhar_id);
            details.setAge(age);
            details.setCity(city);
            details.setState(state);
            
            boolean status = candidateService.add_Candidate_Details(details);
            if(status) {
              msg="Candidate added successfully";
              model.addAttribute("msg", msg);
              return "view_status";
            }
            else{
               msg="Unable to add Candidate";
               model.addAttribute("msg", msg);
               return "view_status";
            }
            
        }    
    }

    
//=============================================================================================================

     //  ======================= : Read All Candidate-Details Operation: (2A) ==========================
    
		// URL:  http://localhost:5082/candidate/view_candidate_list
		@GetMapping("/candidate/view_candidate_list")
		public String view_candidate_list(Model model) {
		   List<Candidate_Details> lst = candidateService.view_candidate_list();
		   
		   if(lst!=null) { 
		     model.addAttribute("candidate_details", lst);
		     return "candidate_list"; 
		   }
		   else {
		     String msg="No Candidate Found";
		     model.addAttribute("msg", msg);
		     return "view_status";
		   }
		}
		
	//  ===================== : Read Single Candidate-Details Operation: (2B) ========================
		
		// URL:  http://localhost:5082/candidate/view_candidate_details?candidate_id={candidate_id}
	    @GetMapping("/candidate/view_candidate_details")
	    public String view_candidate_details(@RequestParam("candidate_id") int candidate_id,
	    									Model model) { 
	    
	      Candidate_Details details = candidateService.get_candidate_details(candidate_id);
	      
	      if(details!=null) {
	        model.addAttribute("candidate_detail", details);
	        return "view_candidate_details";
	      }
	      
	      else{
	         String msg="Unable to Fech Details";
	         model.addAttribute("msg", msg);
	         return "view_status";
	      }
	    
	    }
	   
//====================================================================================================================

	//  ========================= : Update Candidate-Details Operation: (3) ==========================
	    
	    // URL:  http://localhost:5082/candidate/edit_candidate_details
	    @GetMapping("/candidate/edit_candidate_details/{candidate_id}")
	    public String edit_candidate_details(@PathVariable("candidate_id") int candidate_id,
	    										Model model) {
	    	
	    	Candidate_Details details = candidateService.get_candidate_details(candidate_id);
	      
	      if(details!=null) {
	    	  List<Party_Details> lst = candidateService.view_party_list();
	    	  List<String> party_name=new ArrayList<>();
	        
		        for(Party_Details p:lst) {
		            party_name.add(p.getParty_name());
		        }
	        
		        model.addAttribute("party_name", party_name);
	            model.addAttribute("details", details);
	            
	            	return "edit_candidate_details";
	      }
	      
	      else{
	         String msg="Unable to Fech Details";
	         model.addAttribute("msg", msg);
	         	return "view_status";
	      }
	    
	    }
	    
	    
	    // URL:  http://localhost:5082/user/update_details
	    @GetMapping("/candidate/update_details/{candidate_id}")
	    public String update_details(@PathVariable("candidate_id")int candidate_id,
	                                 	  @RequestParam("party_name")String party_name,
	                                      @RequestParam("election_id") int election_id,                             
	                                      @RequestParam("candidate_name") String candidate_name,
	                                      @RequestParam("mobile_no") String mobile_no,
	                                      @RequestParam("addhar_id") String addhar_id,
	                                      @RequestParam("age") int age,
	                                      @RequestParam("city") String city,
	                                      @RequestParam("state") String state,
	                                      Model model)  {
	        
	        String msg="";
	     
	        if(age<25) {
	          msg="Candadiate should be greater than 25 years";
	          model.addAttribute("msg", msg);
	          return "view_status";
	        }
	        else if(party_name.length()==0) {
	          msg="Please Enter valid party name";
	          model.addAttribute("msg", msg);
	          return "view_status"; 
	        }
	        else if(mobile_no.length()!=10) {
	             msg="Please Enter valid 10 digit number";
	          model.addAttribute("msg", msg);
	          return "view_status";
	        }

	        else {
	            Candidate_Details details=new Candidate_Details();
	            details.setCandidate_id(candidate_id);
	        
	            details.setElection_id(election_id);
	            details.setParty_name(party_name);
	            details.setSname(candidate_name);
	            details.setMobile_no(mobile_no);
	            details.setAddhar_id(addhar_id);
	            details.setAge(age);
	            details.setCity(city);
	            details.setState(state);
	            
	            boolean status = candidateService.add_Candidate_Details(details);
	            
	            if(status) {
	              msg="Candidate details update successfully";
	              model.addAttribute("msg", msg);
	              return "view_status";
	            }
	            else{
	               msg="Unable to update candidate details";
	               model.addAttribute("msg", msg);
	               return "view_status";
	            }
	        }
	    }
	    
	    
	    
//====================================================================================================================
	    
	//  ========================= : Delete Candidate-Details Operation: (4) ==========================
	    
	    // URL:  http://localhost:5082/candidate/delete_candidate_details/1
	    @GetMapping("/candidate/delete_candidate_details/{candidate_id}")
	    public String delete_candidate_details(@PathVariable("candidate_id") int candidate_id,
	    										Model model) {
	      boolean status = candidateService.delete_candidate_details(candidate_id);
	      
	      if(status) {
	        return "redirect:/candidate/view_candidate_list";
	      }
	      else{
	          String msg="Unable to Delete Details";
	         model.addAttribute("msg", msg);
	         return "view_status";
	      }
	    }
	       
	    
//====================================================================================================================
//====================================================================================================================	    
}
