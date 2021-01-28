package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.Project;

public class ProjectTest {

	
	@Test
	public void testInfo() {
		Project pp = new Project();
		String res = pp.info();
		assertEquals("Welcome to Project class", res);
	}

}
