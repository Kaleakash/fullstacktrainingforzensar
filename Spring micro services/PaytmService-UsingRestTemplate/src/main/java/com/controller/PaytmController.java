package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.PaytmService;

@RestController
@RequestMapping(value = "paytm")
public class PaytmController {

	@Autowired
	PaytmService paytmService;
	
	@GetMapping(value = "balance/{email}")
	public String getBalanceThroughPaytm(@PathVariable("email") String email) {
	
			return paytmService.getBalanceThroughPaytm(email);
	}
	
	
}
