package com.service;

import java.util.List;

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
	
	public String deleteEmployee(int empId) {
			int res = ed.deleteEmployee(empId);
				if(res==1) {
					return "Record deleted successfully";
				}else if(res==2) {
					return "Exception generated";
				}else {
					return "Record didn't find";
				}
			}
	
	public List<Employee> getAllEmployee() {
		return ed.getAllEmployee();
	}
}



