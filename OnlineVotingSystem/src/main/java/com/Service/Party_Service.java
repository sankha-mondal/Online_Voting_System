package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Party_Details;
import com.Repository.Party_Details_Repository;

@Service
public class Party_Service {
	
	@Autowired
    private Party_Details_Repository party_repo;
	
//========================================================================================================
	
		// ================= : Create Party-Details Operation: (1) =========================
		
		public boolean addPartyDetails(Party_Details details) {
	        try {
	            party_repo.save(details);
	            return true;
	        } catch(Exception e) {
	          e.printStackTrace();
	          return false;
	        }
	    }
	
//========================================================================================================
	
		// ====================== Read Party-Details Operation: (2A) =========================
		
		public List<Party_Details> view_party_list() {
	       List<Party_Details> lst = party_repo.findAll();
		       if(lst.size()>0) {
		           return lst;
		       }
		       else{
		         return null;
		       }
		}
	
		// ================== Read Single Party-Details Operation: (2B) ===========================
		
		public Party_Details get_party_details(String party_id) {
	       Optional<Party_Details> opt=party_repo.findById(party_id);
	       
	       if(opt.isPresent()) {
	         Party_Details details=opt.get();
	         return details;
	       }
	       else{
	         return null;
	       }  
	   }

//========================================================================================================

}
