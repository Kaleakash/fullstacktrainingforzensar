package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
		/*Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ajay Kumar");
		emp.setSalary(14000);
		System.out.println(emp);
		
		FileOutputStream fos = new FileOutputStream("employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		System.out.println("Object Serialization done successfully.....");
		oos.close();
		fos.close();
		*/
		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
				Object obj = ois.readObject();
				Employee emp1 = (Employee)obj;
				
				System.out.println(emp1);
				System.out.println("id is "+emp1.getId());
				System.out.println("Object De-Seriliazation done successfuly");
				ois.close();
				fis.close();
	}

}



