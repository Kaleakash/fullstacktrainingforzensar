package com;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "Welcome to Java Training";
		String str2 = new String("Welcome to Java Training");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.charAt(1));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.length());
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5, 10));	//start 0 index, end 1 position, 
		System.out.println(str1.compareTo(str2));
	}

}
