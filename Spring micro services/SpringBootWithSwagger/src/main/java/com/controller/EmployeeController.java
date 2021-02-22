package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
@RequestMapping(value = "employee")
public class EmployeeController {

	@PostMapping(value = "storeInfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee storeEmployee(@RequestBody Employee emp) {
		return emp;
	}
}
