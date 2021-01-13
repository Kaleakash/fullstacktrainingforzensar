class Cal {
	int a,b,sum;
	Cal() {
	a=1;
	b=2;
	}
	Cal(int x, int y) {
	a=x;
	b=y;
	}
	void setValue(int x, int y) {
	a =x;
	b = y;
	}
	void add() {
	sum = a+b;
	}
	void display() {
		System.out.println("Sum "+sum);
	}	
}
class App {
	public static void main(String args[]) {
	Cal c1 = new Cal();		c1.add();	c1.display();
	Cal c2 = new Cal();		c2.add();	c2.display();
	Cal c3 = new Cal();			c3.display();
	Cal c4 = new Cal(100,200); 	c4.add();	c4.display();
	Cal c5 = new Cal(10,20); 	c5.add();	c5.display();
	Cal c6 = new Cal();	c6.setValue(11,22);	c6.setValue(111,222);	c6.add(); c6.setValue(1111,2222);		c6.display();
	}
}