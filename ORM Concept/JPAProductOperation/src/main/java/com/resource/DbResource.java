package com.resource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbResource {


public static EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProductOperation");   // Connection in JDBC 
		EntityManager manager = emf.createEntityManager();					// Statement or PreparedStatement 
		return manager;
	}
}
