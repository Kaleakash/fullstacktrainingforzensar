package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@SpringBootApplication(scanBasePackages = "com")	// by default scan current package or sub package of current package.
@EntityScan(basePackages = "com.bean")						// Scan entity classes with @Entity annotation 
@EnableJpaRepositories(basePackages = "com")		// by default JpaRepository enable in same package or current package. 
public class DemoTest {

	public static void main(String[] args) {
		SpringApplication.run(DemoTest.class, args);	// running spring boot application 
		System.out.println("Spring boot server started....hi");
	}

}
