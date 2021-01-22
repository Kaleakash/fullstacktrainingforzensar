class Employee {
	String name;
	float salary;
}

@FunctionalInterface
interface EmployeeInterface {
	public Employee passEmployee(Employee emp);
}

class Java8Features{
	public static void main(String args[]) {
	Employee emp1 = new Employee();
	emp1.name="Ravi Kumar";
	emp1.salary=24000;
	
	EmployeeInterface empInf = (emp)->{
			emp.salary = emp.salary+2000;
			return emp;
		};		


	Employee emp2 = empInf.passEmployee(emp1);
	System.out.println("Name is "+emp2.name+" Salary is "+emp2.salary);
	}
}
