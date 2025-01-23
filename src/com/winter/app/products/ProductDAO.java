package com.winter.app.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.utils.DBConnection;

public class ProductDAO {
		
	 //1. 상품추가
	 public int add(ProductDTO productDTO) throws Exception{
		 Connection con = DBConnection.getConnection();
		 String sql="INSERT INTO PRODUCTS (PRODUCTNUM, PRODUCTNAME, PRODUCTRATE, PRODUCTDATE, PRODUCTDETAIL)"
		 		+ "  VALUES (PRODUCT_SEQ.NEXTVAL,?,?,?,?)";
		 PreparedStatement st = con.prepareStatement(sql);
		 st.setString(1, productDTO.getProductName() );
		 st.setDouble(2, productDTO.getProductRate());
		 st.setDate(3, productDTO.getProductDate());
		 st.setLong(4, productDTO.getProductDetail());
		 
		 int result = st.executeUpdate();
		 
		 DBConnection.disConnect(st, con);
		 return result;
	 }	
	
	//2. 상품조회
	 public List<ProductDTO> getList() throws Exception{
		 Connection con = DBConnection.getConnection();
		 String sql = "SELECT * FROM PRODUCTS";
		 PreparedStatement st = con.prepareStatement(sql);
		 ResultSet rs = st.executeQuery();
		 List<ProductDTO> ar = new ArrayList<>();
		 while(rs.next()) {
			 ProductDTO productDTO = new ProductDTO();
			 productDTO.setProductNum(rs.getLong("PRODUCTNUM"));
			 productDTO.setProductName(rs.getString("PRODUCTNAME"));
			 productDTO.setProductRate(rs.getDouble("PRODUCTRATE"));
			 productDTO.setProductDate(rs.getDate("PRODUCTDATE"));
			 productDTO.setProductDetail(rs.getLong("PRODUCTDETAIL"));
			 ar.add(productDTO);
		 }
		 DBConnection.disConnect(rs, st, con);
		 return ar;
	 }
	//3. 상품 상세정보 조회
	 	public ProductDTO getDetail(ProductDTO productDTO) throws Exception{
	 		Connection con = DBConnection.getConnection();
	 		String sql="SELECT * FROM PRODUCTS";
	 		PreparedStatement st = con.prepareStatement(sql);
	 		ResultSet rs = st.executeQuery();
	 		productDTO=null;
	 		if(rs.next()) {
	 			 productDTO  = new ProductDTO();
				 productDTO.setProductNum(rs.getLong("PRODUCTNUM"));
				 productDTO.setProductName(rs.getString("PRODUCTNAME"));
				 productDTO.setProductRate(rs.getDouble("PRODUCTRATE"));
				 productDTO.setProductDate(rs.getDate("PRODUCTDATE"));
				 productDTO.setProductDetail(rs.getLong("PRODUCTDETAIL"));
	 		}
	 		DBConnection.disConnect(rs, st, con);
	 		return productDTO;
	 		
	 	}
	//4. 상품 이자율 수정
	 	public void getRate() {
	 		
	 		
	 		
	 	}
}
