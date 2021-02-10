package com;

public class Employee {
private int id;
private String name;
private float salary;
	public Employee() {
		System.out.println("Object created....using empty");
		this.id=123;
		this.name ="Unknown";
		this.salary = 8000;
	}
	
	public Employee(int id, String name, float salary) {
		super();
		System.out.println("Object created....parameterized empty");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("This is display method");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
