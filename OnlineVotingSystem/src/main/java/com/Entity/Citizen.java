package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="citizen")
public class Citizen {
    
    @Id        
    String voter_id;
    String sname;
    String mobile_no;
    String dob;
    int age;
    String gender;
    String city;
    String state;
    String status;

    public Citizen(String voter_id, String sname, String mobile_no, String dob, int age, String gender, String city, String state, String status) {
        this.voter_id = voter_id;
        this.sname = sname;
        this.mobile_no = mobile_no;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.state = state;
        this.status = status;
    }
    
    public Citizen() {
    
    }
    

    public String getVoter_id() {
        return voter_id;
    }

    public void setVoter_id(String voter_id) {
        this.voter_id = voter_id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    
}
