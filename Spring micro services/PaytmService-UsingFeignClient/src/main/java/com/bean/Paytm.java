package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paytm {
@Id
private String email;
private int accno;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}

}
