package com;

public class StringImmutable {

	public static void main(String[] args) {
		String name="Ravi";
		System.out.println(name);			//Ravi
		name = name+" Kumar";
		
		System.out.println(name);		//Ravi or Ravi Kumar
			System.out.println(name.toUpperCase());
		System.out.println(name);
		System.out.println("Using String Buffer");
		
		StringBuffer sb = new StringBuffer("Ravi");
		System.out.println(sb);
		System.out.println(sb.append(" Kumar"));
		sb.insert(4, " Patil");
		sb.delete(2, 4);
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1);
		System.out.println(sb1.append(" Kumar"));
		System.out.println(sb);
		sb1.insert(4, "Biradar");
		sb1.delete(2, 4);
		System.out.println(sb1);
		
	
	}

}




