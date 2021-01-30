package test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ProductDao;
import com.ProductService;

@RunWith(MockitoJUnitRunner.class)			// Enable jMock API
public class ProductServiceTestMock {

	@Mock
	ProductDao pd;				//mock for DAO layer 

	@InjectMocks
	ProductService ps;		// pull the mock the object in service class. 
	@Test
	public void testServiceMethod() {
		//Fake Testing 
		//when(ps.serviceMethod()).thenReturn("Fake Output");  //Fake Return type
		//assertEquals(ps.serviceMethod(), "Fake Output");
		
		//Actual Testing DAO Method
		when(ps.serviceMethod()).thenCallRealMethod();
		assertEquals(ps.serviceMethod(), "This message from Dao Method");
	}

}
