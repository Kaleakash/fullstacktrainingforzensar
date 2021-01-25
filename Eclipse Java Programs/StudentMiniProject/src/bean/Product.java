package bean;

import java.time.LocalDate;

public class Product {
private int pid;
private String pname;
private float price;
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
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", storeDate=" + storeDate + "]";
}

}
