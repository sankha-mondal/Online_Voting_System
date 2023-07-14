package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IndiaElectionComissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndiaElectionComissionApplication.class, args);
		System.out.println("Running on port number 5082...");
	}

}
