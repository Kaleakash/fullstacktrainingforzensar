package com;

public class DemoTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setId(100);
		System.out.println(emp1.getId());		//100
		
		Employee emp2 = new Employee();
		Employee emp3 = emp2;
		emp2.setId(200);
		emp3.setId(300);
		System.out.println(emp2.getId());	//300
		System.out.println(emp3.getId());	//300
		
		Employee emp4 =emp2.getCloneObject();
		
		System.out.println("AFter clone created...");
		System.out.println("emp4 "+emp4.getId());
		System.out.println("emp2  "+emp2.getId());
		emp4.setId(400);
		System.out.println("emp4 "+emp4.getId());
		System.out.println("emp2  "+emp2.getId());
	}	

}
