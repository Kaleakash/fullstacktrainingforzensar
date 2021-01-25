package com;

import java.util.ArrayList;
import java.util.List;

public class StreamWithMatchOperation {

	public static void main(String[] args) {
		List<String> listOfStd = new ArrayList<>();
		listOfStd.add("Ramesh"); listOfStd.add("Ajay");
		listOfStd.add("Ajay");listOfStd.add("Vikash");
		listOfStd.add("Mahesh"); listOfStd.add("Dinesh");
		listOfStd.add("Seeta");listOfStd.add("Meeta");
		
		//1st match operation 
		boolean res1 = listOfStd.stream().anyMatch(name->name.startsWith("A"));

		//2nd match operation 
		boolean res2 = listOfStd.stream().allMatch(name->name.startsWith("A"));
		
		//3rd operation 
		boolean res3 = listOfStd.stream().noneMatch(name->name.startsWith("B"));
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}

}
