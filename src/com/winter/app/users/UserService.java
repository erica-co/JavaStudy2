package com.winter.app.users;

import java.util.List;

public class UserService {
		
		//Controller DAO사이에서 데이터의 전처리나 후처치
	//멤버변수 객체선언은 private
		private UserDAO userDAO;
		
		public UserService() {
			this.userDAO = new UserDAO();
		}
		//1. 가입
		public int join(UserDTO userDTO) throws Exception{
			
				int result = userDAO.join(userDTO);
			
				return result;
		}
		//2. 목록
		public List<UserDTO> getList() throws Exception {
			
				List<UserDTO> ar = userDAO.getList();
				
				return ar;
		}
		//3. 로그인(디테일)
		public UserDTO login( UserDTO userDTO)throws Exception {
				UserDTO result = userDAO.getDetail(userDTO); //db에서 조회된 ID와 password가 result
				//result와 userDTO의 ID와 password가 같은지 비교해야 됨
				//password가 null이 아닐때 비교
				if(result==null) {
						return result;
				}
				
				if(result.getPassWord().equals(userDTO.getPassWord())) {
					return result;
				}else {
					return null; //비번이 틀렸다
				}
				
				
				
		}
	
	
	
	
	
	
	
	
	
}
