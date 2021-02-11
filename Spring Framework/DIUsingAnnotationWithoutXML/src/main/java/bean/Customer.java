package bean;

import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {
private int custId;
private String custName;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + "]";
}

}
