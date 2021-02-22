package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootWithSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithSwaggerApplication.class, args);
		System.err.println("Server running on port number 9090");
	}

}
