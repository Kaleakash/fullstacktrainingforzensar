package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

	/*@Autowired
	DataSource ds;							// Before spring framework using JNDI look up we search database details from application server 
	
	public List<Employee> getAllEmployee() {
		List<Employee> listOfEmp = new ArrayList<>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
				listOfEmp.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listOfEmp;
	}*/
	
	@Autowired
	EntityManagerFactory emf;
	
	public List<Employee> getAllEmployee() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select e from Employee e");
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;

	}
	
	
	public int storeEmployee(Employee emp) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		try {
		tran.begin();
					manager.persist(emp);
		tran.commit();
		}catch(Exception e) {
			return 2;
		}
		Employee e = manager.find(Employee.class, emp.getId());
		if(e!=null) {
			return 1;
		}else {
			return 0;
		}
	}
}



