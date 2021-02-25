package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value = "employee")
@Api(value = "EmployeeResourceDetails")
public class EmployeeController {

	@PostMapping(value = "storeInfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee storeEmployee(@ApiParam(value = "Send Employee Object") @RequestBody Employee emp) {
		return emp;
	}
}
