package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
		
		
		public int deleteEmployee(int empId) {
			try {
				con = DbResource.getDbConnection();
				pstmt = con.prepareStatement("delete from employee where id = ?");
				pstmt.setInt(1, empId);
				return pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
				return 2;
			}
		}
		
		public List<Employee> getAllEmployee() {
		List<Employee> listOfEmp = new ArrayList<>();
			try {
				con = DbResource.getDbConnection();
				pstmt = con.prepareStatement("select * from employee");
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Employee emp = new Employee();
					emp.setId(rs.getInt(1));
					emp.setName(rs.getString(2));
					emp.setSalary(rs.getFloat(3));
					listOfEmp.add(emp);
				}
			} catch (Exception e) {
				System.err.println(e);
				return null;
			}
			return listOfEmp;
		}
		
		
		
}
