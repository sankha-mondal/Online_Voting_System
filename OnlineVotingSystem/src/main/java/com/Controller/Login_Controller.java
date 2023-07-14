package com.Controller;

import com.Entity.Account_Details;
import com.Service.User_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login_Controller {

    @Autowired
    private User_Service userService;
     
//===========================================================================================================

    // =================== : Login Operation : ===========================
    
    // URL:  http://localhost:5082/user/login
    @GetMapping("/user/login")
    public String getUserInfo_Technical() {
        return "Login";
    }

    // URL:  http://localhost:5082/user/check_user
    @PostMapping("/user/check_user")
    public String checkUserInfo_technical(@RequestParam("user_id") String user_id, 
    									  @RequestParam("password") String password, 
    									  Model model) {
         
        Account_Details account_details = userService.getAccountDetails(user_id);
        
        if(account_details!=null && password.equals(account_details.getPassword())){
            model.addAttribute("account", account_details);
            return "admin_dashboard";
        }
        else{
           String msg="Invalid Account Details";
           model.addAttribute("msg", msg);
           return "view_status";
        }   
    }
    
//=============================================================================================================
    
    // =================== : Update Password Operation : ===========================
    
    // URL:  http://localhost:5082/user/update_password
    @GetMapping("/user/update_password")
    public String update_password() {
        return "update_password";
    }
    
    
     // URL:  http://localhost:5082/user/save_password
    @GetMapping("/user/save_password")
    public String update_passowrd(@RequestParam("user_id") String user_id, 
                                  @RequestParam("old_password") String old_password,
                                  @RequestParam("new_password") String new_password,
                                  @RequestParam("conform_password") String conform_password,
                                  Model model) {
         
        Account_Details account_details = userService.getAccountDetails(user_id);
        
        String msg="Technical error";
        
        if(account_details!=null && old_password.equals(account_details.getPassword())) {
        	
            if(new_password.length()<8) {
                msg="Password length must be greater than 8";
                model.addAttribute("msg", msg);   
            }
             
            else if(new_password.equals(conform_password)) {
                account_details.setPassword(new_password);
                boolean status = userService.update_password(account_details);
	                 if(status) {
	                   msg="Password updated successfull";
	                   model.addAttribute("msg", msg);
	                 }
	                 else{
	                   msg="Unable to update password";
	                   model.addAttribute("msg", msg);
	                 }
           }
           else {
              msg="New password and conform password must be same";
              model.addAttribute("msg", msg);
           }
        }
        
        else if(!old_password.equals(account_details.getPassword())) {
           msg="Current Password Incorrect";
           model.addAttribute("msg", msg);      
        }
        else{
           msg="Invalid Account Details";
           model.addAttribute("msg", msg);
           return "view_status";
        }  
        
         model.addAttribute("msg", msg);
         return "view_status";
    }
    
//==========================================================================================================
    
}
    
 
    
    


