package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Employee;

public class DemoTest3 {

	public static void main(String[] args) {
	List<Employee> listOfEmp = new ArrayList<>();
	listOfEmp.add(new Employee(2, "Ajay", 14000));
	listOfEmp.add(new Employee(1, "Vijay", 12000));
	listOfEmp.add(new Employee(3, "Mahesh", 15000));
	System.out.println("Before Sort");
	for(Employee emp : listOfEmp) {
		System.out.println(emp);
	}
	
	Collections.sort(listOfEmp);
	System.out.println();
	System.out.println("After Sort");
	
	for(Employee emp : listOfEmp) {
		System.out.println(emp);
	}
	}
}
