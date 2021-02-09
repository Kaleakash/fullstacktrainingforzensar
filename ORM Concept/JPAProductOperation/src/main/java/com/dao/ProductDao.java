package com.dao;

import java.util.List;import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bean.Product;
import com.resource.DbResource;

public class ProductDao {

	public List<Product> getAllProduct() {
		EntityManager manager = DbResource.getEntityManager();	// Statement or PreparedStatement 
			Query qry	 = manager.createQuery("select p from Product p");
			List<Product> listOfProduct = qry.getResultList();
			return listOfProduct;
	}
	
	public void storeProduct(Product pp) {
		EntityManager manager = DbResource.getEntityManager();	// Statement or PreparedStatement 
			EntityTransaction tran = manager.getTransaction();
				tran.begin();
						manager.persist(pp);					// store the product in DB like insert query 
				tran.commit();
				System.out.println("Record stored successfully..");
	}
	
	public void deleteProduct(int id) {
		EntityManager manager = DbResource.getEntityManager();	// Statement or PreparedStatement 
		EntityTransaction tran = manager.getTransaction();
		
		Product p	= manager.find(Product.class, id);			// primary key	if record is available automatically convert record to object 
		if(p==null) {															// select * from product where pid =1
			System.out.println("Product is not present");
		}else {
			tran.begin();
						manager.remove(p);						// delete from product where pid = 1;
			tran.commit();
			System.out.println("Record deleted successfully");
		}
	}
	
	public void updateProduct(Product pp) {
		EntityManager manager = DbResource.getEntityManager();	// Statement or PreparedStatement 					// Statement or PreparedStatement 
		EntityTransaction tran = manager.getTransaction();
		
		Product p	= manager.find(Product.class, pp.getPid());			// primary key
		if(p==null) {
			System.out.println("Product is not present");
		}else {
			tran.begin();
						p.setPrice(p.getPrice()+pp.getPrice());
						manager.merge(p);									//update price using pid column 
			tran.commit();
			System.out.println("Record updated successfully");
		}
	}
	
		public List<Product> getAllProductByPrice(float price) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProductOperation");   // Connection in JDBC 
			EntityManager manager = emf.createEntityManager();					// Statement or PreparedStatement 
				Query qry	 = manager.createQuery("select p from Product p where p.price > ?2");
				qry.setParameter(2, price);
				List<Product> listOfProduct = qry.getResultList();
				return listOfProduct;
		}
		
		public List<Object[]> joinQuery() {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProductOperation");   // Connection in JDBC 
			EntityManager manager = emf.createEntityManager();					// Statement or PreparedStatement 
				//Query qry = manager.createQuery("select p.pid from Produdct p");   // only Product Id Integer generics 
			//List<Integer> listOfProduct = qry.getResultList();
			
			//Query qry = manager.createQuery("select p.name from Produdct p");		//only product name String generics 
			//List<String> listOfProduct = qry.getResultList();
			
			//Query qry = manager.createQuery("select p.pid,p.pname from Produdct p"); // object[] generics 
			//List<Object[]> listOfProduct = qry.getResultList();
			
				Query qry	 = manager.createNativeQuery("select e.first_name,d.department_name from employees e, departments d where e.department_id=d.department_id");
				List<Object[]> listOfProduct = qry.getResultList();		// partial objects 
				return listOfProduct;
		}
		
	
	
}


