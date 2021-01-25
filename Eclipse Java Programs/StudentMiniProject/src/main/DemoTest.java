package main;

import service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
	ProductService ps  = new ProductService();
	ps.getAllProduct().stream().forEach(p->System.out.println(p));
	}

}
