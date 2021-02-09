package com.main;

import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

public class DemoTest {

	public static void main(String[] args) {
		ProductDao pd = new ProductDao();

		//Retreive All product details 
	/*
	List<Product> listOfProduct	= pd.getAllProduct();
	System.out.println("Number of product are "+listOfProduct.size());
	for(Product pp:listOfProduct) {
		System.out.println(pp);
	}*/
		
		//Store Product Details 
		/*Product p1 = new Product();
		p1.setPid(4);
		p1.setPname("Laptop");
		p1.setPrice(82000);
			pd.storeProduct(p1);*/
		//Delete Product Details 
		
		//pd.deleteProduct(4);
	
		//Update Query 
		//Product p = new Product();
		//p.setPid(1);
		//p.setPrice(3000);
		
		//pd.updateProduct(p);
		
		//Retrieve product details by where price 
	
		//List<Product> listOfProduct	= pd.getAllProductByPrice(45000);
		//System.out.println("Number of product are "+listOfProduct.size());
		//for(Product pp:listOfProduct) {
		//	System.out.println(pp);
		//}
		
		List<Object[]> objectInfo = pd.joinQuery();
		Iterator<Object[]> ii = objectInfo.iterator();
		while(ii.hasNext()) {
			Object obj[]=ii.next();
			System.out.println("Name is "+obj[0]+" Department Name is "+obj[1]);
		}
	}

}
