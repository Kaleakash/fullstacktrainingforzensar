package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")		// This annotation by default scan all annotation if they are current or sub packages. 
@EntityScan(basePackages = "com")
@EnableJpaRepositories(basePackages = "com")
@EnableEurekaClient
public class PaytmServiceUsingRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmServiceUsingRestTemplateApplication.class, args);
		System.err.println("Paytm service running on port number 9494");
	}

	
	@Bean											//object we are creating but maintain by container. 
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
