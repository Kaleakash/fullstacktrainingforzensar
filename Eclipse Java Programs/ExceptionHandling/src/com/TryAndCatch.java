package com;
public class TryAndCatch {
	public static void main(String[] args) {
	System.out.println("Hi");
	int a=10;
	int b=1;
	int abc[]= {1,2,3,4,5};
	try {
	int res = a/b;					//new ArithemeticException()	
	System.out.println("Result is "+res);
	int res1 = 10/abc[2];
	System.out.println("Result is "+res1);
	}catch(Exception exp) {
		//System.out.println("I Take Care!");		//Exception solver 
		System.out.println(exp.toString());
	}
	System.out.println("Bye...");
	System.out.println("Bye...");
	System.out.println("Bye...");
	}
}
