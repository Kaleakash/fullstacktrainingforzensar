package com;

class Abc {
		void display(Employee emp) {
			
		}
		void receiveGenericObject(Object obj) {
					Class cc = obj.getClass();
					System.out.println(cc.getSimpleName());
		}
		void info(int id, String name, float salary) {
			
		}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee emp = new Employee();
		Manager mgr = new Manager();
		Department dept = new Department();
		Abc obj = new Abc();
		obj.display(emp);
		obj.info(100, "Ravi", 12000);
		obj.receiveGenericObject(emp);
		obj.receiveGenericObject(mgr);
		obj.receiveGenericObject(dept);*/
		
		/*Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Ravi");
		//emp1.setSalary(12000);
		
		Employee emp2 = new Employee(101,"Ramesh",14000);
		
		System.out.println("id is "+emp1.getId());
		System.out.println("name is "+emp1.getName());
		System.out.println("salary is "+emp1.getSalary());
		
		System.out.println("id is "+emp2.getId());
		System.out.println("name is "+emp2.getName());
		System.out.println("salary is "+emp2.getSalary());
		
		System.out.println(emp2);
		
		EmployeeService es = new EmployeeService();
		es.empObject(emp1);
		
		Employee emp4 = es.getEmployee();
		
		System.out.println(emp4);
		
		Employee emp = new Employee();
		Manager mgr = new Manager();
		Department dept = new Department();
		
		Class obj = emp.getClass();			// it is pre-defined method and method return type is Class class reference which give the details about the class. 
		System.out.println(obj.getSimpleName());
		
		*/
		
		Manager mgr = new Manager();
		mgr.dis();
		mgr = null;			//GC 
		System.gc();        // WE can request to JVM for GC
		System.out.println("Bye..");
		System.out.println("Bye...");
	}

}
