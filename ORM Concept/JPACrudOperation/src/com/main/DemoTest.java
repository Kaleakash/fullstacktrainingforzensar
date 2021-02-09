package com.main;

import java.util.List;



import com.bean.Product;
import com.dao.ProductDao;

public class DemoTest {

	public static void main(String[] args) {
		ProductDao pd = new ProductDao();
		List<Product> listOfRec = pd.getListOfProduct();
		System.out.println("Size "+listOfRec.size());
		//PersistenceProvider
		
	}

}
