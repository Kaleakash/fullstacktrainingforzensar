package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class SimpleController {

	@GetMapping(value = "info/{name}")
	public String sayHello(@PathVariable("name") String name) {
			return "Welcome user to Spring boot with Docker "+name;
	}
}
