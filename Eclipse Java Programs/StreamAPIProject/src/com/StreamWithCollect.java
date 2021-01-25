package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamWithCollect {

	public static void main(String[] args) {
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(100, "Vikash", 16000));
		listOfEmp.add(new Employee(101, "Ajay", 19000));
		listOfEmp.add(new Employee(102, "Mahesh", 12000));
		listOfEmp.add(new Employee(103, "Rakesh", 15000));
		
		System.out.println("Before Stream Number of records are "+listOfEmp.size());
		
		//1st Way Collect all object with filter the data. 
		//List<Employee> listOfEmp1 = listOfEmp.stream().filter(emp->emp.getSalary()>=16000).collect(Collectors.toList());
		//System.out.println("Number of Records are "+listOfEmp1.size());
		
		//2nd Way Collect only name with filter data
		//List<String> names = listOfEmp.stream().filter(emp->emp.getSalary()>=16000).map(emp->emp.getName()).collect(Collectors.toList());
		//System.out.println("Names are  "+names.size());
		//System.out.println(names);
		
		
		//3rd Way Collect all object with filter the data and store in Set 
		//Set<Employee> listOfEmp1 = listOfEmp.stream().filter(emp->emp.getSalary()>=16000).collect(Collectors.toSet());
		//System.out.println("Number of Records are "+listOfEmp1.size());
	}

}
