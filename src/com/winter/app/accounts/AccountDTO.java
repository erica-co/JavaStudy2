package com.winter.app.accounts;

import java.sql.Date;

public class AccountDTO {
		private String accountNum;
		private String userName;
		private int productNum;
		private int accountValance;
		private Date accountDate;
		
		
		public String getAccountNum() {
			return accountNum;
		}
		public void setAccountNum(String accountNum) {
			this.accountNum = accountNum;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getProductNum() {
			return productNum;
		}
		public void setProductNum(int productNum) {
			this.productNum = productNum;
		}
		public int getAccountValance() {
			return accountValance;
		}
		public void setAccountValance(int accountValance) {
			this.accountValance = accountValance;
		}
		public Date getAccountDate() {
			return accountDate;
		}
		public void setAccountDate(Date accountDate) {
			this.accountDate = accountDate;
		}
		
		
}
