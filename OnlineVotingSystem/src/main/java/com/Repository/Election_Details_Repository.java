package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Election_Details;

public interface Election_Details_Repository  extends JpaRepository<Election_Details,Integer>{
    
}
