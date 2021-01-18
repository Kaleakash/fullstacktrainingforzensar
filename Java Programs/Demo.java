class Employee {
	
	private int id;
	private String name;
	private float salary;
	
	Employee() {
		this.id = 123;
		this.name = "Unknown";
		this.salary = 8000;	
	}
	
	Employee(int id) {
		this();
		this.id = id;
	}
	
	Employee(int id, String name) {
		//this.id = id;
		this(id);
		this.name = name;
	}
	
	Employee(int id, String name, float salary) {
		//this.id = id;
		//this.name = name;
		this(id,name);
		this.salary = salary;
	}
	
	void disEmp() {
		System.out.println("id is "+id+"Name is "+name+" Salary is "+salary);
		System.out.println("Number of rec "+Employee.rec);
	}
	
	static int rec;
	void setRecordsDetails(int rec) {
		Employee.rec = rec;
	}
}
class Manager extends Employee {
	int numberOfEmp;
	
	Manager(int id, String name, float salary, int numberOfEmp) {
		super(id,name,salary);
		this.numberOfEmp = numberOfEmp;	
	}
	void disMgr() {
		System.out.println("Number of emp is "+numberOfEmp);
	}
}
class Demo {
	
	public static void main(String args[]) {
	int record=10;
	Manager mgr = new Manager(1,"Ravi",45000,5);
	mgr.setRecordsDetails(record);
	mgr.disEmp();
	mgr.disMgr();
	
	}
}	 
