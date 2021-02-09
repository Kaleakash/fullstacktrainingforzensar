package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bean.Trainer;

public class TrainerDao {

	public void store(Trainer t) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARelationship");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
				manager.persist(t);
		tran.commit();
		System.out.println("Trainer records inserted...");
	}
}
