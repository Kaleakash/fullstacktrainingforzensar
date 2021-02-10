package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
	//Resource res   = new ClassPathResource("beans.xml"); //load the xml file and create the Resource reference. 
	//BeanFactory factory = new XmlBeanFactory(res);		//using resource create the BeanFactory interface rereference. 
	
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));							
	/*
	Employee emp = (Employee)factory.getBean("emp1");
	emp.display();
	
	Employee emp1 = (Employee)factory.getBean("emp1");
	emp1.display();
	
	Employee emp2 = (Employee)factory.getBean("emp2");
	emp2.display();

	Employee emp3 = (Employee)factory.getBean("emp2");
	emp3.display();
	*/
	Employee emp4 = (Employee)factory.getBean("emp3");
	emp4.display();
	}

}
