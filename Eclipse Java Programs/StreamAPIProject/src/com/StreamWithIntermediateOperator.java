package com;

import java.util.ArrayList;
import java.util.List;

public class StreamWithIntermediateOperator {

	public static void main(String[] args) {
	List<String> listOfStd = new ArrayList<>();
	listOfStd.add("Ramesh"); listOfStd.add("Ajay");
	listOfStd.add("Ajay");listOfStd.add("Vikash");
	listOfStd.add("Mahesh"); listOfStd.add("Dinesh");
	listOfStd.add("Seeta");listOfStd.add("Meeta");
	//1st all names
	listOfStd.stream().forEach(name->System.out.print(name+" "));
	
	//2st all names with skip few names
	System.out.println();
	listOfStd.stream().skip(3).forEach(name->System.out.print(name+" "));
	
	//3rd limit the names 
	System.out.println();
	listOfStd.stream().limit(4).forEach(name->System.out.print(name+" "));
	
	//4th distinct 
	System.out.println();
	listOfStd.stream().distinct().forEach(name->System.out.print(name+" "));
	
	//5th count 
	long numberOfRec = listOfStd.stream().count();
	System.out.println();
	System.out.println("Number of records "+numberOfRec);
	
	//6th count with remove duplicate 
	long uniqueRec = listOfStd.stream().distinct().count();
	System.out.println();
	System.out.println("Number of records "+uniqueRec);
	}

}
