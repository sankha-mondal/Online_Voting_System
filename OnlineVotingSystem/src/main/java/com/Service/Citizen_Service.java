package com.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Citizen;
import com.Repository.Citizen_Repository;

@Service
public class Citizen_Service {
	
	@Autowired
	Citizen_Repository citizen_Repo;
	
//==============================================================================================================
	
	//  ========================= : Create Citizen_details Operation: (1) ==========================
	
		public boolean add_Citizen_Details(Citizen citizenDetails) {
	        try {
	        	boolean res = citizen_Repo.existsById(citizenDetails.getVoter_id());
	        	if(res) {
	        		return false;
	        	}
	        	else {
	        		citizen_Repo.save(citizenDetails);
		            return true;
	        	}
	        } catch(Exception e) {
	          e.printStackTrace();
	          return false;
	        }
	    }
    
//=============================================================================================================

	// ====================== Read Citizen-Details Operation: (2A) =========================
	
			public List<Citizen> view_citizen_list() {
		       List<Citizen> lst = citizen_Repo.findAll();
			       if(lst.size()>0) {
			           return lst;
			       }
			       else{
			         return null;
			       }
			}
			
	// ================== Read Single Citizen-Details Operation: (2B) ===========================
			
			public Citizen get_citizen_details(String voter_id) {
			       Optional<Citizen> opt = citizen_Repo.findById(voter_id);
			       
			       if(opt.isPresent()) {
			    	  Citizen details = opt.get();
			          return details;
			       }
			       else{
			         return null;
			       }  
			   }

//===============================================================================================================

	// ======================== : Update Citizen-Details Operation: (3) ==========================
			
		public boolean edit_Citizen_Details(Citizen citizenDetails) {
	        try {
        		citizen_Repo.save(citizenDetails);
	            return true;
	        } catch(Exception e) {
	          e.printStackTrace();
	          return false;
	        }
	    }
		
		
//=============================================================================================================
		     
	//  ========================= : Delete Citizen-Details Operation: (4) ==========================
			 
	     public boolean delete_citizen_details(String voter_id) {
	        try{
	           citizen_Repo.deleteById(voter_id);
	           return true;  
	        } catch(Exception e){
	          e.printStackTrace();
	          return false;
	        }
	     }	
			 	
//=============================================================================================================
//=============================================================================================================
			


}
