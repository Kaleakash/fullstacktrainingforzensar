package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bean.Product;

public class ProductDao {

	public List<Product> getListOfProduct() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");// it is equal to connection 
		EntityManager manager = emf.createEntityManager();										// is is equal to Statement or PreparedStement 
		Query qry= manager.createQuery("select p from Product p");				// JPQL Query language 
		List<Product> listOfProduct = qry.getResultList();					// retrieve all product object as a list. 
		return listOfProduct;
	}
}
