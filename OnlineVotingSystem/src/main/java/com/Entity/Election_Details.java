package com.Entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="election_details")
public class Election_Details {
 
   @Id 
   @GeneratedValue(strategy = GenerationType.AUTO)
   int election_id;
   String description;
   @Temporal(TemporalType.DATE)
   Date start_date;
   @Temporal(TemporalType.DATE)
   Date end_date;
   String city;
   String state;
   String result;

    public Election_Details(int election_id, String description, Date start_date, Date end_date, String city, String state, String result) {
        this.election_id = election_id;
        this.description = description;
        this.start_date = start_date;
        this.end_date = end_date;
        this.city = city;
        this.state = state;
        this.result = result;
    }
  
    public Election_Details(){
     
    }
    
    
    public int getElection_id() {
        return election_id;
    }

    public void setElection_id(int election_id) {
        this.election_id = election_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
    
   
   
   
}
