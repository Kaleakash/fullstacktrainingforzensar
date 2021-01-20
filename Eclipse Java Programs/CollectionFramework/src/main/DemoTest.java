package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Ravi");
		emp1.setSalary(14000);
		Employee emp2 = new Employee(101, "Ramesh", 16000);
		System.out.println("Number of Records are "+listOfEmp.size());
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(new Employee(102,"Rakesh",18000));
		//System.out.println("Number of records are "+listOfEmp.size());
		//listOfEmp.remove(0);
		//System.out.println("Number of records are "+listOfEmp.size());
		//listOfEmp.remove(emp2);
		//System.out.println("Number of records are "+listOfEmp.size());
		Iterator<Employee> ii = listOfEmp.iterator();
		while(ii.hasNext()){
						//Object obj = ii.next();			//without ii.next() method return type is Object class reference. 
						//Employee emp = (Employee)obj;			// down level type casting. 
					//System.out.println("id is "+emp.getId()+" Name is "+emp.getName()+"Salary is "+emp.getSalary());		
						//System.out.println(emp);
					Employee emp = ii.next();
					System.out.println(emp);
		}
		
	}

}
