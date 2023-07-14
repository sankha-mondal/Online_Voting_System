package com.Service;

import com.Entity.Account_Details;
import com.Entity.Candidate_Details;
import com.Entity.Citizen;
import com.Entity.Election_Details;
import com.Entity.Party_Details;
import com.Repository.Account_Details_Repository;
import com.Repository.Candidate_Repository;
import com.Repository.Citizen_Repository;
import com.Repository.Election_Details_Repository;
import com.Repository.Party_Details_Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_Service {
    
    @Autowired
    private Election_Details_Repository election_repo;
    
    @Autowired
    private Party_Details_Repository party_repo;
    
    @Autowired
    private Candidate_Repository repo;
    
    @Autowired
    private Citizen_Repository citizen_repo;
    
    @Autowired
    private Account_Details_Repository account_repo;
    
    
 // ====================================================================================================   
      
    public boolean addElectionDetails(Election_Details details) {
          try{
               election_repo.save(details);
               return true;
          } catch(Exception e) {
            e.printStackTrace();
            return false;
          }
    }
    
   
 //======================================================================================================
    
    public boolean addCandidateDetails(Candidate_Details candidate_details) {
             try { 
               repo.save(candidate_details);
               return true;
             } catch(Exception e) {
              e.printStackTrace();
              return false;
             }
      
    }
    
 //====================================================================================================
    
    public List<Citizen> voters_details() {
       List<Citizen> lst = citizen_repo.getVotersList();
       if(lst.size()>0) {
         return lst;
       }
       else{
           return null;
       }
    }
    
    public boolean update_voter_status(String voter_id,String status) {
       Optional<Citizen> opt = citizen_repo.findById(voter_id);
       
       if(opt.isPresent()) {
         Citizen details=opt.get();
         details.setStatus(status);
         citizen_repo.save(details);
         return true;  
       }
       
       else{
         return false;
       }
    }
    
   
 //============================================================================================
   
   public Election_Details get_election_detail(int election_id) {
       Optional<Election_Details> opt=election_repo.findById(election_id);
       
       if(opt.isPresent()) {
         Election_Details election_details=opt.get();
         return election_details;
       }
       else{
         return null;
       }
   }
   
//===============================================================================================
   
   public Candidate_Details get_candidate_details(int candidate_id) {
	   
      Optional<Candidate_Details> opt=repo.findById(candidate_id);
       
       if(opt.isPresent()) {
         Candidate_Details details=opt.get();
         return details;
       }
       else{
         return null;
       }
   }
      
//=================================================================================================
   
   public Account_Details getAccountDetails(String user_id) {
	   
       Optional<Account_Details> opt=account_repo.findById(user_id);
         if(opt.isPresent()) {
         Account_Details details=opt.get();
         return details;
       }
       else{
         return null;
       }
   }
   
//===================================================================================================
   
    public boolean update_password(Account_Details details) {
      try{
          account_repo.save(details);
          return true;
      } catch(Exception e) {
	       e.printStackTrace();
	       return false;
      }
   }
    
//==================================================================================================
    
    public List<Party_Details> view_party_list() {
       List<Party_Details> lst=party_repo.findAll();
       if(lst.size()>0) {
           return lst;
       }
       else{
         return null;
       }
    }
    
 //==============================================================================================
    
    
       public List<Candidate_Details> view_candidate_list() {
    	   
       List<Candidate_Details> lst=repo.findAll();
       
       if(lst.size()>0) {
           return lst;
       }
       else{
         return null;
       }
    }
       

       
//=============================================================================================
       
        public boolean delete_election(int election_id) {
          try{
             election_repo.deleteById(election_id);
             return true;
          }catch(Exception e){
            e.printStackTrace();
            return false;
          }
       }
        
//=============================================================================================
        
        
      public List<Citizen> voter_approval_details() {
       List<Citizen> lst = citizen_repo.getVoterApprovalList();
       if(lst.size()>0) {
         return lst;
       }
       else{
           return null;
       }
    }
      
//===================================================================================================
//===================================================================================================
    
    
}
