package com;
interface A {
	void dis1();
}

class B {
	public static void dis1() {
			System.out.println("This is static method reference");
	}
}
class C {
	public void dis1() {
		System.out.println("This non static method reference");
	}
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		A obj1 = ()->System.out.println("Provided by using Lambda Expression 1 time");
		obj1.dis1();
		
		A obj2 = ()->System.out.println("Provided by using Lambda Expression 1 time");
		obj2.dis1();
		
		// Non static method reference 
		A obj3 = B::dis1;		// Link B class with static Method reference concept. 
		obj3.dis1();
		
		A obj4 = B::dis1;
		obj4.dis1();
		
		C ref = new C();
		A obj5 = ref::dis1;				// Link C class with Non static method reference concept
		obj5.dis1();
		
	}

}
