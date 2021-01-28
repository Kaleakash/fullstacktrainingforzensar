package test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.EmployeeDao;
import com.EmployeeService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeTestMock {
	@Mock
	EmployeeDao ed;				//mock object for DAO layer 
	
	//@Test
	public void testMock() {
		//EmployeeService es = new EmployeeService();
		when(ed.simpleMessage()).thenReturn("hello");			//fake return type 
		
		assertEquals(ed.simpleMessage(), "hello hi");
	}
	
	@Test
	public void testAccountBalance() {
	//	EmployeeDao ed = new EmployeeDao();
		
		//when(ed.getAccountBalance(1010)).thenReturn(10000.0f);		//fake amount return 
		when(ed.getAccountBalance(1010)).thenCallRealMethod();
		assertEquals(ed.getAccountBalance(1010), 100,0.0);
	}
}





