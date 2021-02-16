package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController	//@Controller + @ResponseBody							// Servlet + Rest full Web service 
public class SimpleController {
	
	//http://localhost:8080/SpringRest/say
	@RequestMapping(value = "say")
	public String sayHello() {					// produce data in plain text format with by default get method. 
		System.out.println("I Came here");
		return "Welcome to Simple Rest Full Web Service";
	}
	
	//http://localhost:8080/SpringRest/html
	@RequestMapping(value = "html",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtml() {
		return "<h1>This is HTML format output<h1>";
	}
	
	//http://localhost:8080/SpringRest/xml
	@RequestMapping(value = "xml",method = RequestMethod.GET,produces = MediaType.TEXT_XML_VALUE)
	public String sayXml() {
		return "<h1>This is Xml format output<h1>";
	}
	
	//http://localhost:8080/SpringRest/plain
	@RequestMapping(value = "plain",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlain() {
		return "<h1>This is Plain text format output<h1>";
	}
	
	//http://localhost:8080/SpringRest/qry?name=Ajay&salary=16000 
	@RequestMapping(value = "qry")
	public String queryParamInfo(@RequestParam("name") String fname, @RequestParam("salary") float salary) {
		System.out.println("Your name is "+fname);
		System.out.println("Salary is "+salary);
		salary = salary+2000;
		return "Your gross salary is "+salary;
	}
	
	//http://localhost:8080/SpringRest/path/100/Ramesh Deep/6000
	@RequestMapping(value = "path/{id}/{name}/{salary}")
	public String pathParamInfo(@PathVariable("id") int empId, @PathVariable("name") String fname, 
			@PathVariable("salary") float salary) {
		System.out.println("Your id is "+empId);
		System.out.println("Your Name is "+fname);
		System.out.println("Your salary is "+salary);
		return "Your Name is "+fname+" Your salary is "+salary;
	}
	
}
