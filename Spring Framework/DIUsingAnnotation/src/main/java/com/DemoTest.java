package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee)ac.getBean("emp");
		System.out.println(emp);
		emp.setId(100);
		emp.setName("Ramesh");
		emp.setSalary(12000);
		Address add = emp.getAdd();
		add.setCity("Bangalore");
		add.setState("kar");
		emp.setAdd(add);
		System.out.println(emp);
	}

}
