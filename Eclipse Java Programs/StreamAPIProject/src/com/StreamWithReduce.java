package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamWithReduce {

	public static void main(String[] args) {
		List<String> listOfStd = new ArrayList<>();
		listOfStd.add("Ramesh"); listOfStd.add("Ajay");
		listOfStd.add("Ajay");listOfStd.add("Vikash");
		listOfStd.add("Mahesh"); listOfStd.add("Dinesh");
		listOfStd.add("Seeta");listOfStd.add("Meeta");
		
		Optional<String>  str = listOfStd.stream().filter(s->s.endsWith("b")).reduce((s1,s2)->s1+""+s2);
		if(str.isPresent()) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

}
