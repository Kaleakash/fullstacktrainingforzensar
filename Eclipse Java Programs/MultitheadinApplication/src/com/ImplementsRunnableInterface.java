package com;
class C implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
		}
	}
}
class D implements Runnable {
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ImplementsRunnableInterface {
	public static void main(String[] args) {
	Runnable obj1  = new C();		
	D obj2 = new D();
	//obj1.run();
	//obj2.run();
	//obj1.start();
	//obj2.start();
	Thread t1 = new Thread(obj1);		// Thread class parameterized constructor receive the parameter as Runnable interface reference. 
	Thread t2 = new Thread(obj2);
	t1.start();
	t2.start();
	
	}

}
