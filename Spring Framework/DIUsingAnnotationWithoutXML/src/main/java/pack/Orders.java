package pack;

public class Orders {
private int orderId;
private String typeOfOders;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getTypeOfOders() {
	return typeOfOders;
}
public void setTypeOfOders(String typeOfOders) {
	this.typeOfOders = typeOfOders;
}
@Override
public String toString() {
	return "Orders [orderId=" + orderId + ", typeOfOders=" + typeOfOders + "]";
}

}
