package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dao.TrainerDao;

public class DemoTest {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.setSid(102);
		s1.setSname("Veeta");
		s1.setAge(23);
		s1.setTsid(2);

		Student s2 = new Student();
		s2.setSid(103);
		s2.setSname("Meeta");
		s2.setAge(23);
		s2.setTsid(2);
		
		
		List<Student> listOfStd = new ArrayList<Student>();
		
		listOfStd.add(s1);
		listOfStd.add(s2);
		
		Trainer t1 = new Trainer();
		t1.setTid(2);
		t1.setTname("Ramesh");
		t1.setTech("Python");
		t1.setListOfStd(listOfStd);
		
		
		TrainerDao td = new TrainerDao();
		td.store(t1);
		
	}

}
