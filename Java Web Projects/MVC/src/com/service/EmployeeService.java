package com.service;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao ed =new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()>10000) {
				if(ed.storeEmployee(emp)>0) {
					return "Record stored successfully";
				}else {
					return "Record didn't store";
				}
		}else {
			return "Salary must > 10000";
		}
	}
}
