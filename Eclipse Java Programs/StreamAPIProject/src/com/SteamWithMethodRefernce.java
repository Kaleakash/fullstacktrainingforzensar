package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SteamWithMethodRefernce {

	public static void main(String[] args) {
		Function<String, Integer> str = (op)->Integer.parseInt( op);
		System.out.println(str.apply("100"));
		
		Function<String, Integer> str1 = Integer :: parseInt;
		System.out.println(str1.apply("100"));
		
		/*List<String> listOfStd = new ArrayList<>();
		listOfStd.add("Ramesh"); listOfStd.add("Ajay");
		listOfStd.add("Ajay");listOfStd.add("Vikash");
		listOfStd.add("Mahesh"); listOfStd.add("Dinesh");
		listOfStd.add("Seeta");listOfStd.add("Meeta");
		//Retrieve all records using lambda expression 
		System.out.println("Using Lambda Express");
		listOfStd.stream().forEach(v->System.out.print(v+" "));
		
		System.out.println();
		System.out.println("Using Method reference");
		//Retrieve all records using Method reference.
		listOfStd.stream().forEach(System.out::print);*/
	}

}
