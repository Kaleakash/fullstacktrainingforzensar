package com.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Employee Model Class")
public class Employee {
@ApiModelProperty(value = "Employee Id")
private int id;
@ApiModelProperty(value = "Employee Name")
private String name;
@ApiModelProperty(value = "Employee Salary")
private float salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

}
