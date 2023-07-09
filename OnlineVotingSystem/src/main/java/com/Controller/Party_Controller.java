package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	        boolean status = partyService.addPartyDetails(party_details);
	        if (status) {
	            String msg = "Party Details added successfully";
	            model.addAttribute("msg", msg);
	            return "view_status";
	        } else {
	            String msg = "Unable to add party details";
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

    
    
    
    
    
    
    
	
//============================================================================================================



}
