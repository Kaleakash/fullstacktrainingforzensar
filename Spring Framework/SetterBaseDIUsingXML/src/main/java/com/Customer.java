package com;

import java.util.List;

public class Customer {
public Customer() {
	System.out.println("Object created...");
}
private int custId;
private String cname;
private int age;
private Address add;
private List<String> items;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
public List<String> getItems() {
	return items;
}
public void setItems(List<String> items) {
	this.items = items;
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", cname=" + cname + ", age=" + age + ", add=" + add + ", items=" + items
			+ "]";
}

}
