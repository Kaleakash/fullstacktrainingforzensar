package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.PaytmService;

@RestController
@RequestMapping(value = "paytmfeignclient")
public class PatymController {

	@Autowired
	PaytmService paytmService;
	
	@GetMapping(value = "balance/{email}")
	public String getAccountBalanceThroughFeignClient(@PathVariable("email") String email) {
	
			return paytmService.getBalanceThroughPaytm(email);
	}
}
