package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Candidate_Details;
import com.Entity.Party_Details;
import com.Repository.Candidate_Repository;
import com.Repository.Party_Details_Repository;

@Service
public class Candidate_Service {
	
	@Autowired
    private Party_Details_Repository party_repo;
	
	@Autowired
    private Candidate_Repository candidate_repo;
	
//===========================================================================================================
	
	//  ========================= : Create Candidate-Details Operation: (1) ==========================
	
	public List<Party_Details> view_party_list() {
       List<Party_Details> lst = party_repo.findAll();
       if(lst.size()>0) {
           return lst;
       }
       else{
         return null;
       }
    }
	
	public boolean add_Candidate_Details(Candidate_Details candidate_details) {
        try { 
          candidate_repo.save(candidate_details);
          return true;
        } catch(Exception e) {
         e.printStackTrace();
         return false;
        }
	}
	
//=============================================================================================================

	//  ========================= : Read Candidate-Details Operation: (2A) ==========================
	
	 public List<Candidate_Details> view_candidate_list() {
  	   
	       List<Candidate_Details> lst = candidate_repo.findAll();
	       
	       if(lst.size()>0) {
	           return lst;
	       }
	       else{
	         return null;
	       }
	    }
	 
	//  ==================== : Read Single Candidate-Details Operation: (2B) ========================
	 
	 public Candidate_Details get_candidate_details(int candidate_id) {
		   
	      Optional<Candidate_Details> opt = candidate_repo.findById(candidate_id);
	       
	       if(opt.isPresent()) {
	         Candidate_Details details=opt.get();
	         return details;
	       }
	       else{
	         return null;
	       }
	   }
	
//=============================================================================================================

	
	
	
	
//=============================================================================================================
     
	//  ========================= : Delete Candidate-Details Operation: (4) ==========================
	 
     public boolean delete_candidate_details(int candidate_id) {
        try{
           candidate_repo.deleteById(candidate_id);
           return true;  
        } catch(Exception e){
          e.printStackTrace();
          return false;
        }
     }	
	 	
//=============================================================================================================
//=============================================================================================================
	
	
	
}
