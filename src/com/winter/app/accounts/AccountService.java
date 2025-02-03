package com.winter.app.accounts;

import java.util.Calendar;

public class AccountService {

		private AccountDAO accountDAO;
		
		public AccountService() {
			accountDAO = new AccountDAO();
		}
		
		private static long count=1;
		
		//가입
		public int add(AccountDTO accountDTO) throws Exception{
				//중복x (메서드를 호출할때마다 중복되면안됨)
				//날짜
				// 2025-01-24 10:25:25:125
			
				Calendar calendar = Calendar.getInstance();
				
				return 0;
				
				
				
				
				
		}
		
		
}
