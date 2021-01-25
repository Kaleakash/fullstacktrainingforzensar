package com;
class Task1 implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int i=0;i<10;i++) {
			System.out.println(t+" "+i);
			try {
				Thread.sleep(500);	
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}
class Task2 implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int j=0;j<10;j++) {
			System.out.println(t+" "+j);
			try {
				Thread.sleep(1000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class ThreadLifeMethods {
	public static void main(String[] args) throws Exception{
		Task1 obj1 = new Task1();
		Task2 obj2 = new Task2();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.setName("Bike 1");
		t2.setName("Bike 2");
		System.out.println("1...");
		Thread.sleep(1000);
		System.out.println("2...");
		Thread.sleep(1000);
		System.out.println("3...");
		Thread.sleep(1000);
		System.out.println("Game Start...");
		//System.out.println("First Thread "+t1.isAlive());
		//System.out.println("Second Thread "+t2.isAlive());
		t1.start();
		t2.start();
		//t1.start();
		//System.out.println("First Thread "+t1.isAlive());
		//System.out.println("Second Thread "+t2.isAlive());
		t1.join();
		t2.join();
		System.out.println("Game End....");
	}

}
