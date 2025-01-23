package com.winter.app.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.utils.DBConnection;

public class UserDAO {
		
	//1. 회원가입 (추가) join
		public int join(UserDTO userDTO) throws Exception {
		Connection con = DBConnection.getConnection();
		String sql= "INSERT INTO USERS (USERNAME,PASSWORD,NAME,PHONE,EMAIL)"
				+ " VALUES (?,?,?,?,?) ";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, userDTO.getUserName());
		st.setString(2, userDTO.getPassWord());
		st.setString(3, userDTO.getName());
		st.setString(4, userDTO.getPhone());
		st.setString(5, userDTO.getEmail());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, con); 
		
		return result;
		}
		
		//2. 회원들의 목록을 조회 (메서드명 getList) 단, password는 빼고
		public List<UserDTO> getList()throws Exception {
			Connection con = DBConnection.getConnection();
			String sql= "SELECT USERNAME, NAME, PHONE, EMAIL FROM USERS ";
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			List<UserDTO> ar = new ArrayList<>();
			//row 한줄이 한사람의 정보, 여러개의 row가 나올테니 while반복문 쓰기
			while(rs.next()) {
				UserDTO userDTO = new UserDTO();
				userDTO.setUserName(rs.getString("USERNAME"));
				userDTO.setName(rs.getString("NAME"));
				userDTO.setPhone(rs.getString("PHONE"));
				userDTO.setEmail(rs.getString("EMAIL"));
				ar.add(userDTO);
			
			}
			DBConnection.disConnect(rs, st, con);
			
			return ar;
		}
		
		//회원의 ID로 회원한명의 모든 정보를 조회 메서드명:getDetail
		
		public UserDTO getDetail(UserDTO userDTO)throws Exception{
			
			Connection con = DBConnection.getConnection();
			String sql= "SELECT * FROM USERS WHERE USERNAME=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, userDTO.getUserName());
			ResultSet rs = st.executeQuery();
			userDTO=null;
			//있으면 꺼내세요
			if(rs.next()) {
					userDTO = new UserDTO();
					userDTO.setUserName(rs.getString("USERNAME"));
					userDTO.setPassWord(rs.getString("PASSWORD"));
					userDTO.setName(rs.getString("NAME"));
					userDTO.setPhone(rs.getString("PHONE"));
					userDTO.setEmail(rs.getString("EMAIL"));
				
			}
			
			DBConnection.disConnect(rs, st, con);
			return userDTO;
			
	
		}
		
		
		
}
