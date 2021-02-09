package com.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity								//@Entity annotation on  class. 
@Table(name="product")				//@Table annotation if entity classname and table name is differ 
public class Product {
@Id									//@Id the column contains primary key
private int pid;
@Column(name="pname")
private String name;
private float price;
private LocalDate storeDate;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public LocalDate getStoreDate() {
	return storeDate;
}
public void setStoreDate(LocalDate storeDate) {
	this.storeDate = storeDate;
}

}
