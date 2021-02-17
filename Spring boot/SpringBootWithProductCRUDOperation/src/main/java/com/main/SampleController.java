package com.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping(value = "say")
	public String sayHello() {
		return "Welcome to Spring Rest Controller";
	}
}
