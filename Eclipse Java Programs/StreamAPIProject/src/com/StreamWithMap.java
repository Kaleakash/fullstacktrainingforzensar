package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamWithMap {

	public static void main(String[] args) {
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(100, "Vikash", 16000));
		listOfEmp.add(new Employee(101, "Ajay", 19000));
		listOfEmp.add(new Employee(102, "Mahesh", 12000));
		listOfEmp.add(new Employee(103, "Rakesh", 15000));
		
		//1st way 
		//Stream<Employee> s1 = listOfEmp.stream();
		//Stream<Employee>	s2 = s1.map(emp->emp);		// generic map 
		//s2.forEach(emp->System.out.println(emp));
		
		//2nd way 
		//listOfEmp.stream().map(emp->emp).forEach(emp->System.out.println(emp));
		
		//3rd 	: Using map passing emp object and return only name
		//listOfEmp.stream().map(emp->emp.getName()).forEach(emp->System.out.print(emp+" "));
		//System.out.println();
		//listOfEmp.stream().forEach(emp->System.out.print(emp.getName()+" "));
		
		//4th	: using map passing emp object and return only name in upper case 
		//listOfEmp.stream().map(emp->emp.getName().toUpperCase()).forEach(emp->System.out.print(emp+" "));
		
		//5th	: using map passing emp object and return only name in upper case with sorted..
	//	listOfEmp.stream().map(emp->emp.getName().toUpperCase()).sorted().forEach(name->System.out.println(name));
		
		//6th way Dispaly by Id and salary 
		//listOfEmp.stream().map(emp->emp).forEach(emp->System.out.println("id is "+emp.getId()+" Salary "+emp.getSalary()));
	}

}
