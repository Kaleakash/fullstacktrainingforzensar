package com;

import java.util.ArrayList;
import java.util.List;

public class StreamWithFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(100, "Vikash", 16000));
		listOfEmp.add(new Employee(101, "Ajay", 19000));
		listOfEmp.add(new Employee(102, "Mahesh", 12000));
		listOfEmp.add(new Employee(103, "Rakesh", 15000));
		
		//1st filter by id 
		//listOfEmp.stream().filter(emp->emp.getId()==100).forEach(emp->System.out.println(emp));
		
		//2nd filter by Name
		//listOfEmp.stream().filter(emp->emp.getName().contains("e")).forEach(emp->System.out.println(emp));
		
		//3rd Filter by salary 
		//listOfEmp.stream().filter(emp->emp.getSalary()>15000).forEach(emp->System.out.println(emp));
		
		//4th Filter with Map to display Name with salary condition 
		//float salary = 16000;
		//listOfEmp.stream().filter(emp->emp.getSalary()>salary ).map(emp->emp.getName()).forEach(name->System.out.println(name));
		//listOfEmp.stream().filter(emp->emp.getSalary()>15000).forEach(name->System.out.println(name));
		
		//5th filter with two conditions 
		listOfEmp.stream().filter(emp->emp.getSalary()>15000 && emp.getId()==101).map(emp->emp.getName()).forEach(name->System.out.println(name));
	}

}
