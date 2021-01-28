package testing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import bean.Product;
import dao.ProductDao;

@RunWith(MockitoJUnitRunner.class)
public class ProductTestUsingMock {


	@Mock
	ProductDao pd;					//mock object 
	
	@Test
	public void testDisplayProductDetailsByPrice() {
		List<Product> listOfProduct = new ArrayList<>();
		listOfProduct.add(new Product(1, "Computer", 28000, LocalDate.now()));
		//when(pd.displayProductDetailsByPrice(10000)).thenReturn(listOfProduct);		//Fake REturn 
		
		when(pd.displayProductDetailsByPrice(10000)).thenCallRealMethod();		
		
		List<Product> listResult = pd.displayProductDetailsByPrice(10000);
		Product p = listOfProduct.get(0);
		assertEquals(listResult.size(), 1);
		assertEquals("Computer", p.getpName());
	}

	//@Test
	public void testVerifyUserDetails() {

	}

}
