package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories(basePackages =  "com")
@EnableFeignClients
public class PaytmServiceUsingFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmServiceUsingFeignClientApplication.class, args);
	System.err.println("Server running on port number 9595");
	}

}
