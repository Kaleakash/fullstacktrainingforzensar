package com.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
@Id
private int pid;
private String pname;
private float price;
@Column(name = "storedate")
private LocalDate storeDate;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
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
