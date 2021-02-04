package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Employee;
import com.resource.DbResource;

public class EmployeeDao {
Connection con;
PreparedStatement pstmt;
ResultSet rs;
		public int storeEmployee(Employee emp) {
			try {
				con = DbResource.getDbConnection();
				pstmt = con.prepareStatement("insert into employee values(?,?,?)");
				pstmt.setInt(1, emp.getId());
				pstmt.setString(2, emp.getName());
				pstmt.setFloat(3, emp.getSalary());
				return pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
				return 0;
			}
		}
}
