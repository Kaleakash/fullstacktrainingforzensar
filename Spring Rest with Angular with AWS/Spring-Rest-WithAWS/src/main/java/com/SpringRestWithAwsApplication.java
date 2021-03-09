package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestWithAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestWithAwsApplication.class, args);
		System.out.println("Server running on port number 8080");
	}

}
