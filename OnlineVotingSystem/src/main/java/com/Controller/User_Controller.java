package com.Controller;

import com.Entity.Citizen;
import com.Entity.Election_Details;
import com.Service.User_Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class User_Controller {
    
    @Autowired
    private User_Service service;
    
//============================================================================================================
    
    // URL:  http://localhost:5082/user/add_election
    @GetMapping("/user/add_election")
    public String add_elections() {
       return "add_election_details";
    }
    
    // URL:  http://localhost:5082/user/add_election_details
    @PostMapping("/user/add_election_details")
    public String addElectionDetails(@RequestParam("description")String description,
                                     @RequestParam("start_date") String start_date1,
                                     @RequestParam("end_date") String end_date1,
                                     @RequestParam("city") String city,
                                     @RequestParam("state") String state,
                                     Model model) throws ParseException {
    	
    	System.out.println(start_date1);
        System.out.println(end_date1);
    	
        Date start_date=new SimpleDateFormat("dd-MM-yyyy").parse(start_date1);
        Date end_date=new SimpleDateFormat("dd-MM-yyyy").parse(end_date1);
        
        System.out.println(start_date);
        System.out.println(end_date);
         
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date current_date = sdf.parse(sdf.format(new Date()));
        
        LocalDate myObj = LocalDate.now();
        
        System.out.println("current_date: "+current_date);
        System.out.println("current_date: "+myObj);

        if(start_date.compareTo(current_date)<0) {
            String msg="Invalid Date";
            System.out.println("Invalid data");
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
       
      boolean status=service.addElectionDetails(election_details);
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
  
//============================================================================================    
     
    // URL:  http://localhost:5082/user/new_voter_list
    @GetMapping("/user/new_voter_list")
    public String getVotersList(Model model) {
       List<Citizen> lst=service.voters_details();
       
       if(lst!=null) { 
         model.addAttribute("voters_list", lst);
         return "voters_details"; 
       }
       else {
         String msg="No new registration found";
         model.addAttribute("msg", msg);
         return "view_status";
       }
    }

//==================================================================================================
    
    // URL:  http://localhost:5082/user/voter_approval
    @GetMapping("/user/voter_approval")
    public String getVoterApprovalDetails(Model model) {
       List<Citizen> lst=service.voter_approval_details();
       
       if(lst!=null) {
         model.addAttribute("voters_list", lst);
         return "voter_approval_details"; 
       }
       else{
         String msg="No Approval Pending";
         model.addAttribute("msg", msg);
         return "view_status";
       }
    }
    
//========================================================================================================
    
    
    // URL:  http://localhost:5082/user/get_approval/100/18
    @GetMapping("/user/get_approval/{voter_id}/{voter_name}/{age}")
    public String  send_aproval(@PathVariable("voter_id") String voter_id,
                                @PathVariable("voter_name") String voter_name,
                                @PathVariable("age") int age,
                                Model model) {
       String msg="";
     
      for(int i=0;i<voter_name.length();i++) {
          char ch=voter_name.charAt(i);
          if((ch>=97&& ch<=122)|| (ch>=65&& ch<=90)) {
             continue;    
           }
          else{
          boolean status=service.update_voter_status(voter_id, "Rejected");
          msg="Voter name is invalid application rejects";
          model.addAttribute("msg", msg);
         return "view_status";
          } 
      }
            
       if(age<18) {
         boolean status=service.update_voter_status(voter_id, "Rejected");
         msg="Voter must be alteast 18 years application rejected";
         model.addAttribute("msg", msg);
         return "view_status";
       }
       
       else{
         boolean status=service.update_voter_status(voter_id, "Send for Approval");
         msg="Application send for approval";
         model.addAttribute("msg", msg);
         return "view_status";
       }  
    }
  
    
//==========================================================================================================
//==========================================================================================================
//==========================================================================================================
    
    // URL:  http://localhost:5082/user/search_candidate
    @GetMapping("/user/search_candidate")
    public String search_candidate_details() {
        return "search_candidate_details";
    }
    
//===================================================================================================    
    
     
    
    
    
    
    
    
    
    
}