package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.EmployeeDepartmentService;

@RestController
@RequestMapping(value = "empdept")
public class EmployeeDepartmentController {

	@Autowired
	EmployeeDepartmentService eds;
	
	@GetMapping(value = "info/{id}")
	public ResponseEntity<List<Object[]>> getEmployeeDepartmentInfo(@PathVariable("id") int id){
					List<Object[]> details = eds.getEmployeDepatmentDetails(id);
					return ResponseEntity.status(200).body(details);
	}
}



