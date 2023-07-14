package com.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entity.Election_Details;
import com.Service.Election_Service;

@Controller
public class Election_Controller {
	
	@Autowired
	Election_Service electionService;
	
//===========================================================================================================
	
	//  ========================= : Create Election-Details Operation: (1) ==========================
	
	// URL:  http://localhost:5082/add_election
    @GetMapping("/add_election")
    public String add_elections() {
       return "add_election_details";
    }
    
    // URL:  http://localhost:5082/add_election_details
    @PostMapping("/add_election_details")
    public String addElectionDetails(@RequestParam("description")String description,
                                     @RequestParam("start_date") String start_date1,
                                     @RequestParam("end_date") String end_date1,
                                     @RequestParam("city") String city,
                                     @RequestParam("state") String state,
                                     Model model) throws ParseException {
    	
        Date start_date=new SimpleDateFormat("dd-MM-yyyy").parse(start_date1);
        Date end_date=new SimpleDateFormat("dd-MM-yyyy").parse(end_date1);
         
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date current_date = sdf.parse(sdf.format(new Date()));

        if(start_date.compareTo(current_date)<0) {
            String msg="Invalid Date";
            model.addAttribute("msg", msg);
            return "view_status";
        }
  
        if(end_date.compareTo(start_date)<0) {
            String msg="End end must be greater than start date";
            model.addAttribute("msg", msg);
            return "view_status";
        }
       
      Election_Details election_details=new Election_Details();
      election_details.setDescription(description);
      election_details.setStart_date(start_date);
      election_details.setEnd_date(end_date);
      election_details.setCity(city);
      election_details.setState(state);
       
      boolean status = electionService.addElectionDetails(election_details);
      if(status) {
        String msg="Election details added successfully";
        model.addAttribute("msg", msg);
        return "view_status";  
      }
      
      else{
         String msg="Unable to add details";
         model.addAttribute("msg", msg);
         return "view_status";
      }
    }
    
//===============================================================================================================
    
    //  ========================= : Read All Election-Details Operation: (2A) ==========================
    
	 	// URL:  http://localhost:5082/election/view_election_list
	    @GetMapping("/election/view_election_list")
	    public String view_election_list(Model model) {
	       List<Election_Details> lst = electionService.get_Election_List();
	       if(lst!=null) {
	        model.addAttribute("election_details", lst);
	        return "election_details";
	       }
	       else {
	        String msg="No election found";
	         model.addAttribute("msg", msg);
	         return "view_status";
	       }
	    }
	    
	//  ===================== : Read Single Election-Details Operation: (2B) ========================
	    
	    // URL:  http://localhost:5082/election/view_election_result/1
	    @GetMapping("/election/view_election_result/{election_id}")
	    public String view_election_result(@PathVariable("election_id") int election_id,
	    								   Model model) {
	    	
	        Election_Details details = electionService.get_election_detail(election_id);
	        System.out.println(details.getResult());
	        
	        if(details!=null) {
	          model.addAttribute("election", details);
	          return "view_election_details";
	       }
	       else {
	         String msg="Unable to Fech Details";
	         model.addAttribute("msg", msg);
	         return "view_status";
	       }
	    }
	    
//===============================================================================================================

	//  ========================= : Update Election-Details Operation: (3) ==========================
	    
	    // URL:  http://localhost:5082/election/edit_election_details/1
	    @GetMapping("/election/edit_election_details/{election_id}")
	    public String edit_election_details(@PathVariable("election_id") int election_id,Model model) {
	    	
	      Election_Details details = electionService.get_election_detail(election_id);
	      
	      if(details!=null) {
	        model.addAttribute("details", details);
	        return "edit_election_details";
	      }
	      
	      else{
	         String msg="Unable to Fech Details";
	         model.addAttribute("msg", msg);
	         return "view_status";
	      }
	    
	    }
	    
	    // URL:  http://localhost:5082/election/save_election_details/1
	    @GetMapping("/election/save_election_details/{election_id}")
	    public String save_election_details(@PathVariable("election_id")int election_id,
	                                     @RequestParam("description")String description,
	                                     @RequestParam("start_date") String start_date1,
	                                     @RequestParam("end_date") String end_date1,
	                                     @RequestParam("city") String city,
	                                     @RequestParam("state") String state,
	                                     @RequestParam("result")String result,
	                                     Model model) throws ParseException {
	    	
	        Date start_date=new SimpleDateFormat("dd-MM-yyyy").parse(start_date1);
	        Date end_date=new SimpleDateFormat("dd-MM-yyyy").parse(end_date1);
	         
	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	        Date current_date = sdf.parse(sdf.format(new Date()));


	        if(start_date.compareTo(current_date)<0) {
	            String msg="Invalid Date";
	            model.addAttribute("msg", msg);
	            return "view_status";
	        }
	      
	         
	        if(end_date.compareTo(start_date)<0) {
	            String msg="End end must be greater than start date";
	            model.addAttribute("msg", msg);
	            return "view_status";
	        }
	        
	      Election_Details election_details=new Election_Details();
	      election_details.setDescription(description);
	      election_details.setStart_date(start_date);
	      election_details.setEnd_date(end_date);
	      election_details.setCity(city);
	      election_details.setState(state);
	      election_details.setResult(result);
	       
	      boolean status = electionService.addElectionDetails(election_details);
	      if(status) {
	        String msg="Election details added successfully";
	        model.addAttribute("msg", msg);
	        return "view_status";
	      }
	      
	      else{
	         String msg="Unable to add details";
	         model.addAttribute("msg", msg);
	         return "view_status";
	      }
	    }
 
//===============================================================================================================

	//  ========================= : Delete Election-Details Operation: (4) ==========================
	    
	    // URL:  http://localhost:5082/election/delete_election_details/1
	    @GetMapping("/election/delete_election_details/{election_id}")
	    public String delete_election_details(@PathVariable("election_id") int election_id,
	    									  Model model) {
	      boolean status = electionService.delete_election(election_id);
	      if(status) {
	          return "redirect:/election/view_election_list";
	      }
	      else{
	          String msg="Unable to Delete Details";
	          model.addAttribute("msg", msg);
	          return "view_status";
	      }
	    }
	    
//===============================================================================================================


}
