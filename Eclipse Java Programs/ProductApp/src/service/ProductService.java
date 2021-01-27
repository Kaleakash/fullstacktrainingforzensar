package service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.Product;
import dao.ProductDao;

public class ProductService {	//CRUD Operation 
	List<Product> listOfProduct;
	ProductDao pd;
	
	public ProductService() {
		pd = new ProductDao();
	}
	public List<Product> getAllProductByAsc() {	
		listOfProduct = pd.getAllProduct();
		Collections.sort(listOfProduct,(p1,p2)->p1.getpName().compareTo(p2.getpName()));
		return listOfProduct;
	}
	public String storeRecord(Product pp) {
		if(pp.getPrice()<0) {
			return "Price must be +ve";
		}else if(pp.getPrice()>0 && pp.getPrice()<500) {
			return "Minimum price must be > 500";
		}else if(pd.storeProductDetails(pp)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
}



/*
class SortByName implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getpName().compareTo(o2.getpName());
	}
}
*/

