package com;

public class DefaultThreadDetails {

	public static void main(String[] args) {
	Thread t = Thread.currentThread();
	System.out.println(t);
	String name = t.getName();
	System.out.println("Name of the thread "+name);
	int i = t.getPriority();
	System.out.println("Priority of the thread "+i);
	t.setName("My Thread");
	t.setPriority(2);
	System.out.println(t);
	t.setPriority(Thread.MAX_PRIORITY);
	System.out.println(t);
	t.setPriority(0);
	System.out.println(t);
	}

}
