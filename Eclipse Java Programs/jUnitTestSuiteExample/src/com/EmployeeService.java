package com;

public class EmployeeService {

	public String callDaoMethod() {
		EmployeeDao ed = new EmployeeDao();
		
		return ed.simpleMessage();
	}
}
