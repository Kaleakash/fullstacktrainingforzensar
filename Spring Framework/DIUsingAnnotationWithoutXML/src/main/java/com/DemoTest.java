package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Customer;
import pack.Orders;

public class DemoTest {

	public static void main(String[] args) {
	//ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");		// xml file 
	ApplicationContext ac  = new AnnotationConfigApplicationContext(ConfigurationDetails.class);	//annotation 
	Employee emp = (Employee)ac.getBean("emp");
	System.out.println(emp);
	Customer cc = (Customer)ac.getBean("cust");
	System.out.println(cc);
	
	Orders oo = (Orders)ac.getBean("orderId");
	System.out.println(oo);
	}

}
