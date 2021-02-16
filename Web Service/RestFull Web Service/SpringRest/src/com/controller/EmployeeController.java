package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
public class EmployeeController {

	//http://localhost:8080/SpringRest/empJson
	@RequestMapping(value = "empJson",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeInJson() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(17000);
		return emp;
	}
	
	//http://localhost:8080/SpringRest/empXml
	@RequestMapping(value = "empXml",method = RequestMethod.GET,produces = MediaType.APPLICATION_XML_VALUE)
	public Employee getEmployeeInXml() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(17000);
		return emp;
	}
	
	//http://localhost:8080/SpringRest/employeesJson
		@RequestMapping(value = "employeesJson",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Employee> getAllEmployeeInJson() {
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(100, "Ramesh", 14000));
		listOfEmp.add(new Employee(101, "Raju", 16000));
		listOfEmp.add(new Employee(102, "Raj", 18000));
			
			return listOfEmp;
		}
	
}
