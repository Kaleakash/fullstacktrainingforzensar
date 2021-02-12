package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	EntityManagerFactory emf;
	public int storeEmployee(Employee emp) {
		
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
			manager.persist(emp);
		tran.commit();
		
		Employee e = manager.find(Employee.class, emp.getId());
		if(e!=null) {
			return 1;
		}else {
			return 0;
		}
	}
}
