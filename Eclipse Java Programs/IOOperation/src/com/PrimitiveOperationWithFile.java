package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PrimitiveOperationWithFile {

	public static void main(String[] args) throws Exception{
		/*int id=100;
		String name="Ajay Kumar";
		float salary = 14000;
		FileOutputStream fos = new FileOutputStream("emp.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(id);
		dos.writeUTF(name);
		dos.writeFloat(salary);
		fos.close();
		dos.close();
		System.out.println("Record stored in file");*/
		
		FileInputStream fis = new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);
		int id = dis.readInt();
		String name = dis.readUTF();
		float salary = dis.readFloat();
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
		dis.close();
		fis.close();
	}

}
