package com;

public class Employee implements Cloneable{
	public Employee() {
	System.out.println("Object created...");
	}
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
						public Employee getCloneObject() throws Exception{
									Object obj = clone();
									Employee emp = (Employee)obj;
									return emp;
						}
}
