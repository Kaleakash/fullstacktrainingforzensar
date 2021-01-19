package com;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Raj";		// string literal 
		String str2 = "Raj";		// refer to same memory. 
		String str3 = new String("Raj");	// new memory 
		String str4 = new String("Raj");	//new memory 
		if(str3.equals(str4)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}

}
