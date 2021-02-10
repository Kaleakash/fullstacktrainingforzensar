package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DemoTest {

	public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
	
	/*
	 * Employee emp1 = (Employee)factory.getBean("emp1"); System.out.println(emp1);
	 * 
	 * Employee emp2 = (Employee)factory.getBean("emp2"); System.out.println(emp2);
	 * 
	 * Employee emp3 = (Employee)factory.getBean("emp3"); System.out.println(emp3);
	 */
	Customer cc = (Customer)factory.getBean("cust");
	//cc.setItems(null);
	System.out.println(cc);
	Customer cc1 = (Customer)factory.getBean("cust");
	//cc.setItems(null);
	System.out.println(cc1);
	}

}

