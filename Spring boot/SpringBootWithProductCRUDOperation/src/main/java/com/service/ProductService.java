package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;
import com.dao.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProduct() {
		return productDao.getAllProductDetails();
	}
	
	public List<Product> getAllProductFormSpringData() {
			return productRepository.findAll();
	}
	
	public String storeProduct(Product pp) {
		if(productDao.storeProductInfo(pp)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
	
	public String storeProductSpringData(Product pp) {
			Optional<Product> op = productRepository.findById(pp.getPid());
			if(op.isPresent()) {
				return "Record already present";
			}else {
				Product p = productRepository.save(pp);			// save the records 
				if(p!=null) {
					return "Record stored successfully";
				}else {
					return "Record didn't store";
				}
			}
	}
	
	public String deleteProduct(int pid) {
		if(productDao.deleteProductInfo(pid)>0) {
			return "Record deleted successfully";
		}else {
			return "Record didn't find";
		}
	}
	
	
	public String deleteProductSpringData(int pid) {
									if(productRepository.existsById(pid)) {
										productRepository.deleteById(pid);
										return "Record deleted successfully";
									}else {
										return "Record not present";
									}
	}
	public String updateProduct(Product pp) {
		if(productDao.updateProductInfo(pp)>0) {
			return "Record updated successfully";
		}else {
			return "Record didn't find";
		}
	}
	public String updateProductSpringData(Product pp) {
				Optional<Product> obj	 = productRepository.findById(pp.getPid());
				if(obj.isPresent()) {
					Product p	 = obj.get();
					p.setPrice(pp.getPrice());
				productRepository.saveAndFlush(p);
				return "Record updated successfully";
		}else {
			return "Record not present";
		}
	}
	
}
