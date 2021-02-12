package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "store",method = RequestMethod.POST)
	public ModelAndView storeEmployeeDetails(HttpServletRequest req,Employee emp) {
		emp.setId(Integer.parseInt(req.getParameter("id")));
		emp.setName(req.getParameter("name"));
		emp.setSalary(Float.parseFloat(req.getParameter("salary")));
		ModelAndView mav = new ModelAndView();
		String res = employeeService.storeEmployee(emp);
		System.out.println(res);
		mav.setViewName("employeeStore.jsp");
		return mav;
	}
}
