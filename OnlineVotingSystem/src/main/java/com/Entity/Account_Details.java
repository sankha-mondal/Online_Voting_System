package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="account_details")
public class Account_Details {
   @Id
   String user_id;
   String password;
   String email;
   String mobile_no;
   String role;

    public Account_Details(String user_id, String password) {
        this.user_id = user_id;
        this.password = password;
    }

    public Account_Details()
    {
    }
    
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
   
}
