package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "demo")
public class DemoController {

	@GetMapping(value = "say")
	public String sayHello() {
		return "This second client controller ";
	}
}
