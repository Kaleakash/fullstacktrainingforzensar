package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "sample")
public class SampleController {

	@GetMapping(value = "say")
	public String sayHello() {
		return "Welcome to Spring Rest with swagger";
	}
	@GetMapping(value = "path/{name}")
	public String pathParams(@PathVariable("name") String name) {
		return "Welcome to Spring Rest with Swagger "+name;
	}
}
