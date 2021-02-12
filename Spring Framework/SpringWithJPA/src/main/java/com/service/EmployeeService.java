package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployee() {
				return employeeDao.getAllEmployee().stream().filter(emp->emp.getSalary()>13000).collect(Collectors.toList());
	}
	
	public String storeEmployee(Employee emp) {
		int res =employeeDao.storeEmployee(emp); 
		if(res ==1) {
			return "Successfully Stored";
		}else if(res==2){
			return "Exception generated";
		}else {
			return "Didn't inserted";
		}
	}
}
