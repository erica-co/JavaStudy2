package com.winter.app.country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.winter.app.utils.DBConnection;

public class CountryDAO {
			
		public void getList() throws Exception {
			Connection con = DBConnection.getConnetion();
			String sql = "SELECT * FROM COUNTRIES ORDER BY 3";
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("REGION_ID"));
			}
			DBConnection.disConnect(rs, st, con);
		}
		
		
		public void getDetail() throws Exception {
			Connection con = DBConnection.getConnetion();
			String sql = "SELECT * FROM COUNTRIES WHERE REGION_ID";
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				System.out.println("REGION_ID");
			}else {
				System.out.println("Data가 없다");
			}
			DBConnection.disConnect(rs, st, con);
		
		}
	
	
	
	
	
	
	
}
