package com;
class Abc implements Runnable{
	@Override
	public synchronized void run() {
	String name = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+" "+i);
			try {
				Thread.sleep(1000);
								if(name.equals("Ajay") && i==5) {
									wait();
								}
								if(name.equals("Mahesh") && i==6) {
									wait();
								}
								if(name.equals("Vijay") && i==2) {
									notifyAll();
								}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class WaitAndNotifyExample {
	public static void main(String[] args) {
	Abc obj1 = new Abc();
	Thread t1 = new Thread(obj1, "Ajay");
	Thread t2 = new Thread(obj1, "Vijay");
	Thread t3 = new Thread(obj1, "Mahesh");
	t1.start();
	t2.start();
	t3.start();
	}
}
