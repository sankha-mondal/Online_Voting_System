package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Candidate_Details;


public interface Candidate_Repository extends JpaRepository<Candidate_Details,Integer> {
    
}
