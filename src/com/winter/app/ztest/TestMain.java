package com.winter.app.ztest;

public class TestMain {

	public static void main(String[] args) {
		
		try {
			
			DBConnectionTest test = new DBConnectionTest();
			test.getConnectionTest();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
