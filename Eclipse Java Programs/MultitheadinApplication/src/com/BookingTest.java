package com;

import java.awt.print.Book;

class Booking implements Runnable{
	int avl=1;
	@Override
	public synchronized void run() {
	String name = Thread.currentThread().getName();
		if(avl==1) {
			System.out.println(name+"Got the ticket");
			avl=avl-1;
		}else {
			System.out.println(name+"Sorry no ticket");
		}
	}
}
public class BookingTest {
	public static void main(String[] args) {
	Booking b1 = new Booking();
	//Booking b2 = new Booking();
	//Booking b3 = new Booking();
	Thread t1 = new Thread(b1,"Ravi");
	Thread t2 = new Thread(b1,"Ajay");
	Thread t3 = new Thread(b1,"Vijay");
	t1.start();
	t2.start();
	t3.start();
	}

}
