package com;

public class ProductService {

	ProductDao pd = new ProductDao();
	
	public String serviceMethod() {
		//business logic 
		System.out.println("I Came here! - Service class");
		return pd.daoMethod();
	}
	
	
}
