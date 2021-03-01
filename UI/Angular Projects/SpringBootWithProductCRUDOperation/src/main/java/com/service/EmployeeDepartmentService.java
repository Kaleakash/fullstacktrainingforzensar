package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDepartmentDao;

@Service
public class EmployeeDepartmentService {

	@Autowired
	EmployeeDepartmentDao edd;
	
	public List<Object[]> getEmployeDepatmentDetails(int id) {
		return edd.getEmployeeDepartment(id);
	}
}
