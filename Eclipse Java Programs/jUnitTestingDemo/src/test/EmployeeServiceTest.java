package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import bean.Employee;
import service.EmployeeService;

public class EmployeeServiceTest {

	//@Test
	public void testEmpInfo() {
		EmployeeService es =new EmployeeService();
		Employee emp = new Employee();
		emp.setName("Ajay");
		String res = es.empInfo(emp);
		//assertEquals("Welcome Ajay", res);
		//assertNull(res);
		assertNotNull(res);
	}

	//@Test
	public void testGetStdNamesListOfString() {
		List<String> listOfNames = new ArrayList<>();
		listOfNames.add("Raju"); listOfNames.add("Mahesh"); listOfNames.add("Dinesh");
		listOfNames.add("Ram"); listOfNames.add("Vikash"); listOfNames.add("Seeta");
		EmployeeService es =new EmployeeService();
		
		List<String> filterNames = es.getStdNames(listOfNames);
		try {
			assertEquals(3, filterNames.size());
		} catch (AssertionError e) {
		System.err.println("Size not match "+e);
		}
		
		assertEquals("Dinesh", filterNames.get(1));
		
		
	}

	@Test
	public void testGetStdNamesMapOfIntegerString() {
		Map<Integer, String> info= new HashMap<>();
		info.put(1, "raj");
		info.put(2, "ajay");
		EmployeeService es =new EmployeeService();
		Set<String>	names	= es.getStdNames(info);
		Iterator<String> li   = names.iterator();
		
		while(li.hasNext()) {
			String name = "RAJ";
		//assertEquals(true, names.contains("RAJ"));
			assertEquals(name, li.next());
		}
	}

	//@Test
	public void testConvertObject() {
		
	}

	//@Test
	public void testGetUpdateSalary() {
		
	}

	//@Test
	public void testCallMethod() {
		
	}

}
