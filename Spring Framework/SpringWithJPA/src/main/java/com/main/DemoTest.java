package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;


public class DemoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService es = (EmployeeService)ac.getBean("employeeService");
	//	es.getAllEmployee().forEach(emp->System.out.println(emp));
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Ravi");
		emp.setSalary(24000);
		String res = es.storeEmployee(emp);
		System.out.println(res);
	}

}
