package dao;

import java.security.spec.PSSParameterSpec;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import bean.Product;
import resource.DbResource;

public class ProductDao {
Connection con;
PreparedStatement pstmt;
ResultSet rs;
Statement stmt;

	public List<Product> getAllProduct() throws ArrayIndexOutOfBoundsException{
		List<Product> listOfProduct = new ArrayList<>();
		try {
			con = DbResource.getDbConnection();
			pstmt = con.prepareStatement("select * from product");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Product p  = new Product();
				p.setpId(rs.getInt(1));
				p.setpName(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				p.setStoreDate(rs.getDate(4).toLocalDate());     // converting sql date into LocalDate format.
				listOfProduct.add(p);
			}
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("Primary key issue "+e);
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("SQL Related Exception "+e);
		}
		return listOfProduct;
	}
	
	public int storeProductDetails(Product pp) {
		try {
			con = DbResource.getDbConnection();
			pstmt = con.prepareStatement("insert into product values(?,?,?,?)");
			pstmt.setInt(1, pp.getpId());
			pstmt.setString(2, pp.getpName());
			pstmt.setFloat(3, pp.getPrice());
			pstmt.setDate(4, Date.valueOf(pp.getStoreDate()));		// converting LocalDate into SQL Date format
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("SQL Related Exception "+e);
			return 0;
		}
	}
}
