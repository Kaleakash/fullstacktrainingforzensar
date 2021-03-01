package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;


// http://localhost:9090/product/info

@RestController
@RequestMapping(value = "product")
@CrossOrigin						// This annotation is use to enable CORS featuers. 
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://localhost:9090/product/info
	@GetMapping(value = "info")
	public String simpleMessage() {
		return "Welcome to Spring Rest Product Controller";
	}
	// http://localhost:9090/product/allProduct
	@GetMapping(value = "allProduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProductDetails() {
		return productService.getAllProduct();
	}
	
	// http://localhost:9090/product/allProductData 
	
	@GetMapping(value = "allProductData",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProductDetailsFromSpringData(){
			return productService.getAllProductFormSpringData();
	}
	
	
	
	// http://localhost:9090/product/storeProduct
	@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Product pp) {
			return productService.storeProduct(pp);
	}
	
	// http://localhost:9090/product/storeProductData
	@PostMapping(value = "storeProductData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProductSpringData(@RequestBody Product pp) {
		return productService.storeProductSpringData(pp);
	}
	

	// http://localhost:9090/product/updateProduct
	@PutMapping(value = "updateProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProduct(@RequestBody Product pp) {
			return productService.updateProduct(pp);
	}
	
	@PutMapping(value = "updateProductData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProductSpringData(@RequestBody Product pp) {
			return productService.updateProductSpringData(pp);
	}
	
	// http://localhost:9090/product/deleteProduct/100
	@DeleteMapping(value = "deleteProduct/{pid}")
	public String deleteProduct(@PathVariable("pid") int pid) {
			return productService.deleteProduct(pid);
	}
	
	@DeleteMapping(value = "deleteProductData/{pid}")
	public String deleteProductSpringData(@PathVariable("pid") int pid) {
			return productService.deleteProductSpringData(pid);
	}
	
	
	@GetMapping(value = "findProductById/{pid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getProductById(@PathVariable("pid") int pid) {
		return productService.findProductById(pid);
	}
}


