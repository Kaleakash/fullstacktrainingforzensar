package service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Employee;

public class EmployeeService {

	public String empInfo(Employee emp) {
		//coding.....
		
		return "Welcome "+emp.getName();
		//return null;
	}
	
	public List<String> getStdNames(List<String> listStd){
		
		List<String> names = listStd.stream().filter(e->e.contains("e")).collect(Collectors.toList());
		
		return names;
		
	}
	
public Set<String> getStdNames(Map<Integer, String> listInfo){
		
		Collection<String> ss = listInfo.values();
		return ss.stream().map(e->e.toUpperCase()).collect(Collectors.toSet());
	}
	public Employee convertObject(int id, String name, float salary) {
		//logic 
		
		Employee emp = new Employee(id, name, salary);
		return emp;
	}
	
	public List<Employee> getUpdateSalary(List<Employee> listOfEmp){
		
		//return listOfEmp.stream().flatMap().
		return listOfEmp;
	}
	int count;						// count value is zero before call after call we update to 1  
	public void callMethod() {
		//logic 
		
		count++;
	}
	
	
}
