package com.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.AccountService;

@RestController
@RequestMapping(value = "account")
public class AccountController {

	
	@Autowired
	AccountService accountService;
	
	@GetMapping(value = "balance/{accno}")
	public String checkBalance(@PathParam("accno") int accno) {
		return accountService.getBalance(accno);
	}
}
