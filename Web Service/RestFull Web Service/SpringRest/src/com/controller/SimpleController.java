package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController								// Servlet + Rest full Web service 
public class SimpleController {

	
	@RequestMapping(value = "say")
	public String sayHello() {					// produce data in plain text format with by default get method. 
		System.out.println("I Came here");
		return "Welcome to Simple Rest Full Web Service";
	}
}
