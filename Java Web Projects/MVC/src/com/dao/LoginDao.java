package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Employee;
import com.bean.Login;
import com.resource.DbResource;

public class LoginDao {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
		public boolean checkLogin(Login ll) {
		try {
			con = DbResource.getDbConnection();
			pstmt = con.prepareStatement("select * from login where user like ? and pass like ?");
			pstmt.setString(1,ll.getUser());
			pstmt.setString(1, ll.getPass());
			rs = pstmt.executeQuery();
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
	
		}
		return false;
	}
}
