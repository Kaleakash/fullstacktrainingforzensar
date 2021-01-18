class Employee {
	int id;
	String name;
	Employee() {
		System.out.println("Object created...");
	}
	void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
	}
}

class Demo {
	public static void main(String args[]) {
	Employee emp = new Employee();	
	emp.id=100;
	emp.name="Ravi";
	emp.id=101;
	emp.display();
	Employee employees[]=new Employee[100];	// employees can hold 100 reference of type Employee 
	
	employees[0]=new Employee();
	employees[0].id=102;
	employees[0].name="Ramesh";
	employees[0].display();
	
	employees[1]=new Employee();
	employees[1].id=103;
	employees[1].name="Ramu";
	employees[1].display();

	int abc[]=new int[10];
		
	}
}	 