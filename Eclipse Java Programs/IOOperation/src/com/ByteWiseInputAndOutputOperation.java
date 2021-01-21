package com;

import java.io.DataInputStream;
import java.io.PrintStream;

public class ByteWiseInputAndOutputOperation {

	public static void main(String[] args) throws Exception{
		DataInputStream dis = new DataInputStream(System.in);
		PrintStream ps = System.out;
		ps.println("Enter the id ");
		int id = Integer.parseInt(dis.readLine());		//convert string to int
		ps.println("Enter the name");
		String name = dis.readLine();
		ps.println("Enter the salary");
		float salary = Float.parseFloat(dis.readLine());
		ps.println("Id is "+id);
		ps.println("Name is "+name);
		ps.println("Salary is "+salary);
	}
}
