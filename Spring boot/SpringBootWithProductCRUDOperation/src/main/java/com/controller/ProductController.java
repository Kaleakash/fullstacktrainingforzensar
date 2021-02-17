package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// http://localhost:9090/product/info

@RestController
@RequestMapping(value = "product")
public class ProductController {

	@GetMapping(value = "info")
	public String simpleMessage() {
		return "Welcome to Spring Rest Product Controller";
	}
	
}


