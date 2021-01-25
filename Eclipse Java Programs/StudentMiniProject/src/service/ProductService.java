package service;

import java.util.List;
import java.util.stream.Collectors;

import bean.Product;
import dao.ProductDao;

public class ProductService {

	public List<Product> getAllProduct() {
		ProductDao pd = new ProductDao();
		//return pd.getAllProduct();
		
		return pd.getAllProduct().stream().filter(e->e.getPrice()>50000).collect(Collectors.toList());
	}
}
