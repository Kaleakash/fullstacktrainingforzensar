package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationTest {

	public static void main(String[] args) {
		//1st way 	Primitive types 
		//Stream<Integer> s1 = Stream.of(10,20,30,40,50,60);
		//s1.forEach(v->System.out.print(v+" "));
		
		//2nd Way Integer object 
		//Integer abc[]= {10,20,30,40,50,60};
		//Stream<Integer> s1 = Stream.of(abc);
		//s1.forEach(v->System.out.print(v+" "));
		
		//3rd way primitive array 
		//int abc[]= {10,20,30,40,50,60};
		//IntStream s1 = IntStream.of(abc);
		//s1.forEach(v->System.out.print(v));
		
		//4th way Collection 
		//List<String> listOfStd = new ArrayList<>();
		//listOfStd.add("Ravi"); listOfStd.add("Ramesh"); listOfStd.add("Ajay");
		//listOfStd.add("Vikash"); listOfStd.add("Akash");
		//Stream<String> s1 = listOfStd.stream();
		//s1.forEach(v1->System.out.print(v1+" "));

		//5th Way Collection with complex object 
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(100, "Ravi", 16000));
		listOfEmp.add(new Employee(101, "Ramesh", 19000));
		listOfEmp.add(new Employee(102, "Raju", 12000));
		listOfEmp.add(new Employee(103, "Rakesh", 15000));
		
		Stream<Employee> s1 = listOfEmp.stream();
		//s1.forEach(e->System.out.print(e.getId()+" "));
		//s1.forEach(e->System.out.print(e.getName()+" "));
		//s1.forEach(e->System.out.print(e.getSalary()+" "));
		//s1.forEach(e->System.out.println(e));
		//listOfEmp.stream().forEach(emp->System.out.println(emp));
	}

}
