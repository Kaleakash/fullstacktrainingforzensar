class A {
	void dis1() {
		System.out.println("A class method");
	}
}
class B extends A {
	void dis2() {
		System.out.println("B class method");
	}
}
class Demo {
	public static void main(String args[]) {
	A obj1 = new A();		
	obj1.dis1();
	B obj2 = new B();		
	obj2.dis2();
	obj2.dis1();	
	}
}	 