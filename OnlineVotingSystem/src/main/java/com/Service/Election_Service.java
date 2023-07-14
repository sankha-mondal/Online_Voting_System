package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Election_Details;
import com.Repository.Election_Details_Repository;

@Service
public class Election_Service {
	
	@Autowired
    private Election_Details_Repository election_repo;
	
//========================================================================================================
	
	 public boolean addElectionDetails(Election_Details details) {
         try{
              election_repo.save(details);
              return true;
         
         } catch(Exception e) {
           e.printStackTrace();
           return false;
         }
     }
	 
//========================================================================================================
 
	//  ========================= : Read All Election-Details Operation: (2A) ==========================
	 
	  public List<Election_Details> get_Election_List() {
	       List<Election_Details> lst = election_repo.findAll();
	       if(lst.size()>0) {
	         return lst;
	       }
	       else{
	         return null;
	       }
	   }
	  
	//  ===================== : Read Single Election-Details Operation: (2B) ========================
	  
	  public Election_Details get_election_detail(int election_id) {
	       Optional<Election_Details> opt = election_repo.findById(election_id);
	       
	       if(opt.isPresent()) {
	         Election_Details election_details=opt.get();
	         return election_details;
	       }
	       else{
	         return null;
	       }
	   }
	 
//========================================================================================================
	  
	  
//========================================================================================================
	  
	//  ========================= : Delete Election-Details Operation: (4) ==========================
	  
	  public boolean delete_election(int election_id) {
          try{
             election_repo.deleteById(election_id);
             return true;
          }catch(Exception e){
            e.printStackTrace();
            return false;
          }
       }

}
