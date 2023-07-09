package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="candidate_details")
public class Candidate_Details {
  
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)  
   int candidate_id;
    
    String party_name;
    int election_id;
    
    String sname;
    String mobile_no;
    String addhar_id;
    int age;
    String city;
    String state;

    public Candidate_Details(int candidate_id, String party_name, int election_id, String sname, String mobile_no, String addhar_id, int age, String city, String state) {
        this.candidate_id = candidate_id;
        this.party_name = party_name;
        this.election_id = election_id;
        this.sname = sname;
        this.mobile_no = mobile_no;
        this.addhar_id = addhar_id;
        this.age = age;
        this.city = city;
        this.state = state;
    }

    
   
 
    
    public Candidate_Details()
    {
    
    }
    

    public int getCandidate_id() {
        return candidate_id;
    }

    public void setCandidate_id(int candidate_id) {
        this.candidate_id = candidate_id;
    }


    public String getParty_name() {
        return party_name;
    }

    public void setParty_name(String party_name) {
        this.party_name = party_name;
    }

    
    
    public int getElection_id() {
        return election_id;
    }

    public void setElection_id(int election_id) {
        this.election_id = election_id;
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

    public String getAddhar_id() {
        return addhar_id;
    }

    public void setAddhar_id(String addhar_id) {
        this.addhar_id = addhar_id;
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
    
    

    
   
    
}
