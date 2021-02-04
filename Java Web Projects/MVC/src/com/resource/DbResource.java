package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;



public class DbResource {
private static Connection con;
public static Connection getDbConnection () {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","root");
	} catch (Exception e) {
		// TODO: handle exception
	}
	return con;
} 

}
