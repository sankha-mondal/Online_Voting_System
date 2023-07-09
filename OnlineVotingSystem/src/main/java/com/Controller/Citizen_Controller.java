package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;
import com.Entity.Citizen;
import com.Service.Citizen_Service;

@Controller
public class Citizen_Controller {
	
	@Autowired
	Citizen_Service citizenService;
    
//=============================================================================================================
	
	// ==================== : Create Citizen-Details Operation: (1) ===========================
	
			// URL:  http://localhost:5082/citizen/add_citizen
			@GetMapping("/citizen/add_citizen")
			public String add_citizen() {
			    return "add_citizen_details";
			}
	    
	    
		    // URL:  http://localhost:5082/citizen/save_citizen_details
		    @PostMapping("/citizen/save_citizen_details")
		    public String addPartyDetails(@RequestParam("voter_id") String voter_id,
		    							  @RequestParam("sname") String sname,
		                                  @RequestParam("mobile_no") String mobile_no,
		                                  @RequestParam("dob") String dob,
		                                  @RequestParam("age") int age,
		                                  @RequestParam("gender")String gender,
		                                  @RequestParam("city") String city,  
		                                  @RequestParam("state") String state,
		                                  @RequestParam("status") String status,
		                                  Model model) {
		        
		    	Citizen citizen = new Citizen();
		        
		    	citizen.setVoter_id(voter_id);
		    	citizen.setSname(sname);
		    	citizen.setMobile_no(mobile_no);
		    	citizen.setDob(dob);
		    	citizen.setAge(age);
		    	citizen.setGender(gender);
		    	citizen.setCity(city);
		    	citizen.setState(state);
		    	citizen.setStatus(status);
		
		        boolean res = citizenService.add_Citizen_Details(citizen);
		        
		        if (res) {
		            String msg = "Citizen Details added successfully";
		            model.addAttribute("msg", msg);
		            return "view_status";
		        } else {
		            String msg = "Unable to add Citizen details or Already added...";
		            model.addAttribute("msg", msg);
		            return "view_status";
		        }
		    } 
				    
//=============================================================================================================

	 // ======================= : Read All Citizen-Details Operation: (2A) ==========================
	    
	    // URL:  http://localhost:5082/citizen/citizen_list
	    @GetMapping("/citizen/citizen_list")
	    public String view_citizen_list(Model model) {
	    	
	    	List<Citizen> details = citizenService.view_citizen_list();
	    	
		    if(details!=null) {
		        model.addAttribute("citizen_list", details);
		        return "citizen_list";
		    }
	        else {
	           String msg="Unable to Fech Details";
	           model.addAttribute("msg", msg);
	           return "view_status";
	        }
	    }
	    
	   
	 // ================== Read Single Citizen-Details Operation: (2B) ===========================
	    
	    // URL:  http://localhost:5082/citizen/view_citizen_details?voter_id=101
	    @GetMapping("/citizen/view_citizen_details")
	    public String view_citizen_details(@RequestParam("voter_id") String voter_id,Model model) {
	    	
	    	Citizen details = citizenService.get_citizen_details(voter_id);
		      
		      if(details!=null) {
		        model.addAttribute("citizen_details", details);
		        return "view_citizen_detail";
		      }  
		      else {
		         String msg="Unable to Fech Details";
		         model.addAttribute("msg", msg);
		         return "view_status";
		      }
	    }
    	
//============================================================================================================

		    
		    
}
