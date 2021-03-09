package com;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "login")
@CrossOrigin
public class LoginController {

	
	@PostMapping(value = "check")
	public String checkUser(@RequestBody Login ll) {
		if(ll.getUser().equals("Akash") && ll.getPass().equals("Kale")){
			return "success";
		}else {
			return "failure";
		}
	}
}
