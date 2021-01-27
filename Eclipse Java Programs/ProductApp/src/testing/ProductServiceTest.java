package testing;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bean.Product;
import service.ProductService;

public class ProductServiceTest {
	static ProductService ps;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 ps= new ProductService();
		System.out.println("This method call only once at first time");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		ps = null;
		System.out.println("This method call only once at last time");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("Before every test method");
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("After every test method");
	}
	//@Test
	public void testGetAllProductByAsc() {
		//System.out.println("While testing");
		List<Product> listOfProduct = ps.getAllProductByAsc();
		assertEquals(4, listOfProduct.size());
		Product p= listOfProduct.get(0);
		assertEquals("Computer", p.getpName());
	}
	@Test
	public void testStoreRecord() {
		//System.out.println("While testing");
		Product p = new Product();
		p.setpId(104);
		p.setpName("Pen");
		p.setPrice(550);
		LocalDate ld  = LocalDate.now();
		p.setStoreDate(ld);
		String res	= ps.storeRecord(p);
		String msg = "Record didn't store";
		assertEquals(msg, res);
	}

}
