package com;

public class TryWithMultipleCatch {
	static void dis() {
		System.out.println("Method invoked...");
	}
	public static void main(String[] args) {
		int abc[]= {0,1,2,3,4};
		String str ="10a";
		try {
			int res = 10/abc[2];
			System.out.println("Res is "+res);
			int res1 = Integer.parseInt(str);		//converting string to integer 
			System.out.println(res1+100);
		}catch (ArithmeticException e) {
			System.out.println("Divided zero");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index");
			dis();
		}catch(Exception e) {
			System.out.println("Generic Exception");
		} 
		System.out.println("Normal Statement");
	}

}
