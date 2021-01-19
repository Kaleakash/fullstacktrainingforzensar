package com;

public class EmployeeService {
					public void info() {
						System.out.println("No passing parameter no return type");
					}
					public void addNumber(int x, int y) {		// passing two int primitive value but no return type
						System.out.println(x+y);
					}
					public int add(int x, int y) {				//passing parameter no return type
						return x+y;
					}
					public String sayHello() {		//no passing parameter but return value. 
						return "Welcome";
					}
					
					public void empDetails(int id, String name, float salary) {
						
					}
					
					public void empDetails(int id, String name, float salay, int age) {
						
					}
					
					public void empObject(Employee emp) {
						System.out.println("In Business method");
						System.out.println(emp);
					}
					
					public Employee getEmployee() {
						Employee emp = new Employee(3, "Ajay", 18000);
						return emp;
					}
}




