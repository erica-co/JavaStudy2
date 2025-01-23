package com.winter.app.ztest;

public class TestMain {

	public static void main(String[] args) {
		
		try {
			
			//DBConnectionTest test = new DBConnectionTest();
			//test.getConnectionTest();
			
			ProductDAOTest productDAOTest = new ProductDAOTest();
			
			//userDAOTest.joinTest();
			//userDAOTest.getListTest();
			//userDAOTest.getDetailTest();
			productDAOTest.getList();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
