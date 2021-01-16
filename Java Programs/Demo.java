class A {
	A() {
		System.out.println("A class constructor");
	}
	void dis1() {
		System.out.println("A class method ");
	}
	{
		System.out.println("Initialization block 1");
	}
	static {
		System.out.println("static block");
	}
	{
		System.out.println("Initialization block 2");
	}
}	
class Demo {
	public static void main(String args[]) {
	A obj1 =new A();
	obj1.dis1();
	obj1.dis1();
	A obj2 = new A();
	obj2.dis1();
	obj2.dis1();
	}
}	 