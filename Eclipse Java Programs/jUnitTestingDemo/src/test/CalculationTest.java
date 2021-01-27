package test;

import static org.junit.Assert.*;

import static java.lang.Math.*;			//static import 

//import java.util.HashSet.*;

import org.junit.Test;

import com.Calculation;

public class CalculationTest {

	@Test				// it is like a main method in testing. 
	public void testAdd() {
		//fail("Not yet implemented");
		Calculation cc = new Calculation();
		int res = cc.add(100, 200);
		//assertXXX
		assertEquals(300, res);
		//double ll = Math.PI;
		//double ll = PI;
	}

}
