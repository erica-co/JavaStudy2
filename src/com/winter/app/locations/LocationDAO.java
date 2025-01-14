package com.winter.app.locations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.winter.app.utils.DBConnection;

public class LocationDAO {
	
			//1. 접속정보선언
			//2. connection
		 	//3. SQL문 생성
			//4. 미리보내기
			//5.
			//6. 최종 전송 및 결과 처리
			//7. 연결 해제
			public void getList () throws Exception {
				Connection con = DBConnection.getConnetion();
				String sql = "SELECT * FROM LOCATIONS ORDER BY 1 ASC";
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs = st.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString("LOCATION_ID"));
				}
				DBConnection.disConnect(rs, st, con);
			}
	
	
	
	
	
	
	
			public void getDetail () throws Exception {
				Connection connection = DBConnection.getConnetion();
				String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID=1000";
				PreparedStatement st = connection.prepareStatement(sql);
				ResultSet rs = st.executeQuery();
				if(rs.next()) {
					System.out.println("LOCATION_ID");
				}else {
					System.out.println("Data가 없다");
				}
				
				DBConnection.disConnect(rs, st, connection);
			}
	
	

}
