package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import bean.Product;

public class ProductDao {

	
		public List<Product> getAllProduct() {
			List<Product> listOfProduct = new ArrayList<>();
			try {

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
				PreparedStatement pstmt = con.prepareStatement("select * from product");
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Product p = new Product();
					p.setPid(rs.getInt("pid"));
					p.setPname(rs.getString("pname"));
					p.setPrice(rs.getFloat(3));
					//p.setStoreDate(rs.getDate(4));	We have to convert SQL Date format to Java7/Java8 Date format.
					p.setStoreDate(rs.getDate(4).toLocalDate());     // conveting SQL date to LocalDate format. 
					listOfProduct.add(p);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return listOfProduct;
		}
}
