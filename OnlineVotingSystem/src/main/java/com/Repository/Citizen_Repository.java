package com.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Entity.Citizen;


public interface Citizen_Repository extends JpaRepository<Citizen, String>{
        
        @Query(value = "FROM Citizen p WHERE  p.status='new'")
        List<Citizen> getVotersList();
        
          @Query(value = "FROM Citizen p WHERE  p.status='Send for Approval'")
        List<Citizen> getVoterApprovalList();
             
    
    
}
