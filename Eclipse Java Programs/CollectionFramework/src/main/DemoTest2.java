package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoTest2 {

	public static void main(String[] args) {
		List<String> listOfStd = new ArrayList<>();
		listOfStd.add("Vijay"); listOfStd.add("Mahesh"); listOfStd.add("Dinesh");
		listOfStd.add("Vikash"); listOfStd.add("Ajay");
		System.out.println("For each loop Before sort");
		for(String name:listOfStd) {
			System.out.print(name+"--");
		}
		
		Collections.sort(listOfStd);
		
		System.out.println("\nAfter sorting Asc");
		for(String name:listOfStd) {
			System.out.print(name+"--");
		}
		Collections.reverse(listOfStd);
		System.out.println("\nAfter sorting Desc");
		for(String name:listOfStd) {
			System.out.print(name+"--");
		}
	}

}
