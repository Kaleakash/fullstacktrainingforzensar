package bean;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private float salary;
@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//return this.id-o.id;		//both are equal 0, first value > second value +, first value < second value - Asc Id wise 
		//return o.id-this.id;			// id Desc 
	return this.name.compareTo(o.name);			//Name asc 
	
	}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
