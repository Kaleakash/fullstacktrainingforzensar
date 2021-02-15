package org.tempuri;

public class DemoTest1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Calculator cc = new Calculator();		// Create the Service class object. 
		CalculatorSoap obj = cc.getCalculatorSoap();		// using SErvice class object create the interface reference. 
		
		System.out.println(obj.subtract(100, 50));
	}

}
