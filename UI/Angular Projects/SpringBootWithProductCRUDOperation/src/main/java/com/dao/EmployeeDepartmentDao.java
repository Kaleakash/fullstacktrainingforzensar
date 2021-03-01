package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDepartmentDao {
@Autowired
EntityManagerFactory factory;

public List<Object[]> getEmployeeDepartment(int id) {
					EntityManager manager  = factory.createEntityManager();
					Query qry =
manager.createNativeQuery("select e.first_name,e.salary,d.department_name from employees e, departments d where e.department_id=d.department_id and e.employee_id = :empId");
					
					qry.setParameter("empId", id);
					List<Object[]> list = qry.getResultList();
					return list;
}

}
