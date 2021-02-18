package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDao {

@Autowired
EntityManagerFactory emf;	//DataSource ds; pure JDBC , jdbcTemplate (Spring Dao), EntityManagerFactory emf(JPA), SessionFactory sf(Hibernate), Spring data JpaRepository 

		public List<Product> getAllProductDetails() {
			EntityManager manager = emf.createEntityManager();
			Query qry = manager.createQuery("select p from Product p");
			List<Product> listOfRec = qry.getResultList();
			return listOfRec;
		}
		
		
		public int storeProductInfo(Product pp) {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(pp);
			tran.commit();
			Product p = manager.find(Product.class, pp.getPid());
			if(p==null) {
				return 0;
			}else {
				return 1;
			}
		}
		
		public int updateProductInfo(Product pp) {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			Product p = manager.find(Product.class,pp.getPid());
			if(p==null) {
				return 0;
			}else {
				tran.begin();
						p.setPrice(p.getPrice()+pp.getPrice());
						manager.merge(p);
				tran.commit();
				return 1;
			}
		}
		
		public int deleteProductInfo(int pid) {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			Product p = manager.find(Product.class,pid);
			if(p==null) {
				return 0;
			}else {
				tran.begin();
						manager.remove(p);
				tran.commit();
				return 1;
			}
		}
}
