package bean;

import java.time.LocalDate;

public class Product {
private int pId;			// camel naming rules 
private String pName;	//camel 
private float price;
private LocalDate storeDate;
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
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
public Product(int pId, String pName, float price, LocalDate storeDate) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.price = price;
	this.storeDate = storeDate;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + ", storeDate=" + storeDate + "]";
}

}
