package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "simple")
public class SimpleController {

		@GetMapping(value = "info")
		public String sayHello() {
				return "Welcome to Spring Rest with gradle";
		}
}
