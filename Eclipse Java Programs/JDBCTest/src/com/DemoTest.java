package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class DemoTest {

	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");		//mysql 5.x version 
			Class.forName("com.mysql.cj.jdbc.Driver");		// mysql 8.x version 
			System.out.println("Driver Loaded successfully...");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			System.out.println("Connected successfully");
			Statement stmt  = con.createStatement();
			System.out.println("Statement created successfully...");
			PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the id ");
			int id = Integer.parseInt(br.readLine());
			System.out.println("enter the name");
			String name = br.readLine();
			System.out.println("Enter the salary");
			float salary  = Float.parseFloat(br.readLine());
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setFloat(3, salary);
			int res1 = pstmt.executeUpdate();
			if(res1>0) {
				System.out.println("Record inserted successfully..");
			}
			PreparedStatement pstmt1 = con.prepareStatement("delete from emp where id =?");
			pstmt1.setInt(1, 2);
			int res2 = pstmt.executeUpdate();
			
			// Retrieve Query 
			/*ResultSet rs = stmt.executeQuery("select * from employees");
			while(rs.next()) {
					System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2));
			}*/
			// Insert Query 
			/*int res1 = stmt.executeUpdate("insert into emp values(2,'Ramesh',14000)");       //      
			if(res1>0) {
				System.out.println("Record inserted successfully...");
			}*/
			//Delelete Query 
			
			/*int res1 = stmt.executeUpdate("delete from emp where id = 2");       //      
			if(res1>0) {
				System.out.println("Record deleted successfully...");
			}else {
				System.out.println("Not record found");
			}
			*/
			
			//update query 
			/*int res1 = stmt.executeUpdate("update emp set salary = 24000 where id=1");       //      
			if(res1>0) {
				System.out.println("Record updated successfully...");
			}else {
				System.out.println("Not record found");
			}
			*/
			
		// Insert Query value through keyboards 
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the id ");
		int id = Integer.parseInt(br.readLine());
		System.out.println("enter the name");
		String name = br.readLine();
		System.out.println("Enter the salary");
		float salary  = Float.parseFloat(br.readLine());
		int res1 = stmt.executeUpdate("insert into emp values("+id+",' "+name+" ',"+salary+")");       //      
						if(res1>0) {
							System.out.println("Record inserted successfully...");
						}
			*/
			
			
			//rs.close();
			//stmt.close();
			//con.close();
		} catch (Exception e) {
			System.err.println(e.toString());
		}

	}

}
