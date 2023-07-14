package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="party_details")
public class Party_Details {
   
   @Id
   String party_id;
   String party_name;
   String founded;
   String party_leader;
   String type;

    public Party_Details(String party_id, String party_name, String founded, String party_leader, String type) {
        this.party_id = party_id;
        this.party_name = party_name;
        this.founded = founded;
        this.party_leader = party_leader;
        this.type = type;
    }

   
   
   
    public Party_Details() {
    
    }
    

    public String getParty_id() {
        return party_id;
    }

    public void setParty_id(String party_id) {
        this.party_id = party_id;
    }

    public String getParty_name() {
        return party_name;
    }

    public void setParty_name(String party_name) {
        this.party_name = party_name;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getParty_leader() {
        return party_leader;
    }

    public void setParty_leader(String party_leader) {
        this.party_leader = party_leader;
    }

    
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
   
   
    
}
