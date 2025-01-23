package com.winter.app.ztest;

import java.sql.Connection;

import com.winter.app.utils.DBConnection;

public class DBConnectionTest {
	
			//DBConnection의 Connection 메서드 테스트
			//static 이어서 객체 안만들어도 됨
			
			public void getConnectionTest() throws Exception{
				Connection con = DBConnection.getConnection();
				
				if(con != null) {
					System.out.println("테스트 통과");
				}else {
					System.out.println("테스트 실패");
				}
				
			}
		}

