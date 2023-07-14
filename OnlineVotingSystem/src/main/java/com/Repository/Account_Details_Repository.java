package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Account_Details;


public interface Account_Details_Repository extends JpaRepository<Account_Details,String> {
    
}
