package com;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping(value = "/**")
	public ResponseEntity<Object> sayControllerInformation() {
		return ResponseEntity.status(404).body("Not Found URL");
	}
}
