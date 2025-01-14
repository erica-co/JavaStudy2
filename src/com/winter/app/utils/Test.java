package com.winter.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	
		public void m1() throws Exception {
			//1. 접속 정보 선언
			System.out.println("DB 접속");
			String username="hr";
			String password="hr";
			String url="jdbc:oracle:thin:@15.164.164.246:1521:xe";
			String driver= "oracle.jdbc.driver.OracleDriver";
			
			//2. CONNECTION
			
			try {
				Class.forName(driver);
				Connection connection = DriverManager.getConnection(url, username, password);
			//3. SQL문 생성
			String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID=1000";
			//4. 미리 전송
			PreparedStatement st= connection.prepareStatement(sql);
			//5. (나중에)
			
			//6. 최종 전송 및 결과처리
			ResultSet resultSet = st.executeQuery();
			
			if(resultSet.next()) {
				System.out.println(resultSet.getInt("LOCATION_ID"));
				System.out.println(resultSet.getString("STREET_ADDRESS"));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
			}else {
				System.out.println("Data가 없다");
			}
			//7. 자원 해제
			resultSet.close();
			st.close();
			connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

}
