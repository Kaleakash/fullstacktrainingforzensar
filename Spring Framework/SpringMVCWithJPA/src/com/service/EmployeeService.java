package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	public String storeEmployee(Employee emp) {
		if(employeeDao.storeEmployee(emp)>0) {
			return "Record stored successsfully";
		}else {
			return "Didn't store";
		}
	}
}
