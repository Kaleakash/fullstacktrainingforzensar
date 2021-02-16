package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
		//simple post method 
		// http://localhost:8080/SpringRest/simplePost
		@RequestMapping(value = "simplePost",method = RequestMethod.POST)
		public void callPostMethod() {
			System.out.println("post method called...");
		}
		
		//http://localhost:8080/SpringRest/simpleDelete
		@RequestMapping(value = "simpleDelete",method = RequestMethod.DELETE)
		public void callDeleteMethod() {
			System.out.println("Delete method called....");
		}
		
		//http://localhost:8080/SpringRest/simpleUpdate
		@RequestMapping(value = "simpleUpdate",method = RequestMethod.PUT)
		public void callUpdateMethod() {
			System.out.println("Put method called....");
		}
		
		@RequestMapping(value = "storeEmployee",method = RequestMethod.POST,
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.TEXT_PLAIN_VALUE)
		public String passEmployeeObject(@RequestBody Employee emp) {
			System.out.println(emp);
			return "Welcome user "+emp.getName();
		}
				
		@RequestMapping(value = "updateEmployee",method = RequestMethod.PUT,
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.TEXT_PLAIN_VALUE)
		public String updateEmployeeObject(@RequestBody Employee emp) {
			System.out.println("This is employee update method");
			System.out.println(emp);
			emp.setSalary(emp.getSalary()+2000);
			return emp.getName()+", Your Salary is updated as "+emp.getSalary();
		}
		@RequestMapping(value = "deleteEmployee/{empId}",method = RequestMethod.DELETE,
				produces = MediaType.TEXT_PLAIN_VALUE)
		public String deleteEmployeeInfo(@PathVariable("empId") int id) {
			
			return "Your record deleted successfully using the id as "+id;
		}
}

