package com;

import java.util.HashSet;
import java.util.Set;
class A {}
class B extends A {}
class C extends B {}
class Abc {
	void pass(Set<A> ss) {
		
	}
}
public class DemoTest {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		Abc obj = new Abc();
		Set<?> ss = new HashSet<>();
		ss.add(obj1);	
		ss.add(obj2); 
		ss.add(obj3);
		obj.pass(ss);
	}

}
