package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Employee;

public class EmployeeTest {


	@Test
	public void testDisplay() {
		Employee emp = new Employee();
		String res = emp.display();
		assertEquals("Welcome to Employee class", res);
	}
	@Test
	public void testInfo() {
		Employee emp = new Employee();
		String res = emp.info();
		assertEquals("Welcome to Employee class", res);
	}

	
}
