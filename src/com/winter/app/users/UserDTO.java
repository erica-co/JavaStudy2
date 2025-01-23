package com.winter.app.users;

public class UserDTO {
		// 선언
		// 접근지정자 private
		// 데이터타입과 변수명 테이블과 동일하게
		// Getter/Setter가 필요
		// 생성자는 기본생성자 필수
		
		private String userName;
		private String passWord;
		private String name;
		private String phone;
		private String email;
		
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassWord() {
			return passWord;
		}
		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
}
