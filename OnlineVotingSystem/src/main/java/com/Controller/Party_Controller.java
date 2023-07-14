package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entity.Party_Details;
import com.Service.Party_Service;

@Controller
public class Party_Controller {
	
	@Autowired
	Party_Service partyService;
	
//============================================================================================================
	
		// ==================== : Create Party-Details Operation: (1) ===========================
		
		// URL:  http://localhost:5082/party/add_party_details
		@GetMapping("/party/add_party_details")
		public String add_party() {
		    return "add_party_details";
		}
    
    
	    // URL:  http://localhost:5082/party/save_party_details
	    @PostMapping("/party/save_party_details")
	    public String addPartyDetails(@RequestParam("party_id")String party_id,
	                                  @RequestParam("party_name")String party_name,
	                                  @RequestParam("party_leader")String party_leader,
	                                  @RequestParam("founded")String founded,
	                                  @RequestParam("type") String type,                             
	                                  Model model) {
	        
	        Party_Details party_details = new Party_Details();
	        party_details.setParty_id(party_id);
	        party_details.setParty_name(party_name);
	        party_details.setFounded(founded);
	        party_details.setParty_leader(party_leader);
	        party_details.setType(type);
	
	        boolean status = partyService.add_Party_Details(party_details);
	        if (status) {
	            String msg = "Party Details added successfully...";
	            model.addAttribute("msg", msg);
	            return "view_status";
	        } else {
	            String msg = "Unable to add party details...Party details with this ID alraedy stored...";
	            model.addAttribute("msg", msg);
	            return "view_status";
	        }
	    } 
    
//============================================================================================================
    
    // ======================= : Read All Party-Details Operation: (2A) ==========================
    
	    // URL:  http://localhost:5082/party/party_list
	    @GetMapping("/party/party_list")
	    public String view_party_list(Model model) {
	    	
	    	List<Party_Details> details = partyService.view_party_list();
		    if(details!=null) {
		        model.addAttribute("party_details", details);
		        return "party_list";
		    }
	      
	        else {
	           String msg="Unable to Fech Details";
	           model.addAttribute("msg", msg);
	           return "view_status";
	        }
	    }
	    
//============================================================================================================
	   	   
	    // ================== : Read Single Party-Details Operation: (2B) =======================
	    
	    // URL:  http://localhost:5082/party/view_party_details?party_id=P1
	    @GetMapping("/party/view_party_details")
	    public String view_party_details(@RequestParam("party_id") String party_id,Model model) {
	    	
		      Party_Details details = partyService.get_party_details(party_id);
		      
		      if(details!=null) {
		        model.addAttribute("party_details", details);
		        return "view_party_detail";
		      }  
		      else {
		         String msg="Unable to Fech Details";
		         model.addAttribute("msg", msg);
		         return "view_status";
		      }
	    }
    	
//============================================================================================================

	// ======================== : Update Party-Details Operation: (3) ==========================
	    
	    // URL:  http://localhost:5082/party/edit_party_details
	    @GetMapping("/party/edit_party_details/{party_id}")
	    public String edit_party_details(@PathVariable("party_id") String party_id,
	    								Model model) {
	    	
	    Party_Details details = partyService.get_party_details(party_id);
	      
	      if(details!=null) {
	            model.addAttribute("details", details); 
	            return "edit_party_details";
	      }
	      else{
	         String msg="Unable to Fech Details";
	         model.addAttribute("msg", msg);
	         	return "view_status";
	      }
	    }
  
	   
	    // URL:  http://localhost:5082/party/update_details
	    @GetMapping("/party/update_details/{party_id}")
	    public String update_details(@PathVariable("party_id") String party_id,
							    		@RequestParam("party_name") String party_name,
						                @RequestParam("founded") String founded,
						                @RequestParam("party_leader") String party_leader,
						                @RequestParam("type")String type,
	                                     Model model)  {
	        
	        String msg="";
	     
	        if(party_name.length()<3) {
	          msg="Party Name should be greater than 3 chars";
	          model.addAttribute("msg", msg);
	          return "view_status";
	        }
	        else if(party_leader.length()<3) {
	             msg="Please Enter Party Leader";
	          model.addAttribute("msg", msg);
	          return "view_status";
	        }

	        else {
	            Party_Details details=new Party_Details();
	           
	            details.setParty_id(party_id);
	            details.setParty_name(party_name);
	            details.setFounded(founded);
	            details.setParty_leader(party_leader);
	            details.setType(type);            
	            
	            boolean res = partyService.edit_Party_Details(details);
	            
	            if(res) {
	              msg="Party details update successfully";
	              model.addAttribute("msg", msg);
	              return "view_status";
	            }
	            else{
	               msg="Unable to update party details";
	               model.addAttribute("msg", msg);
	               return "view_status";
	            }
	        }
	    }
	    
	    
    
    
    
//====================================================================================================================

	//  ========================= : Delete Party-Details Operation: (4) ==========================
	    
	    // URL:  http://localhost:5082/party/delete_party_details/{party_id}
	    @GetMapping("/party/delete_party_details/{party_id}")
	    public String delete_party_details(@PathVariable("party_id") String party_id,
	    									Model model) {
	      boolean status = partyService.delete_party_details(party_id);
	      
	      if(status) {
	        return "redirect:/party/party_list";
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
