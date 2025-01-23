package com.winter.app.accounts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.utils.DBConnection;

public class AccountDAO {
	
			//계좌 추가
			public int add(AccountDTO accountDTO) throws Exception{
				Connection con = DBConnection.getConnection();
				String sql="INSERT INTO ACCOUNTS (ACCOUNTNUM, USERNAME, PRODUCTNUM, ACCOUNTVALANCE, ACCOUNTDATE)"
						+ "  VALUES(?,?,?,?,?)";
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, accountDTO.getAccountNum());
				st.setString(2, accountDTO.getUserName());
				st.setInt(3, accountDTO.getProductNum());
				st.setInt(4, accountDTO.getAccountValance());
				st.setDate(5, accountDTO.getAccountDate());
				
				int result = st.executeUpdate();
				
				DBConnection.disConnect(st, con);
				
				return result;
			}
			
			
			//계좌들의 정보를 조회- 특정한 회원의 계좌목록
			public List<AccountDTO> getList()throws Exception{
				Connection con = DBConnection.getConnection();
				String sql= "SELECT * FROM ACCOUNTS WHERE USERNAME=?";
				PreparedStatement st = con.prepareStatement(sql);
				
				ResultSet rs = st.executeQuery();
				List<AccountDTO> ar = new ArrayList<>();
				while(rs.next()) {
					AccountDTO accountDTO = new AccountDTO();
					accountDTO.setAccountNum(rs.getString("ACCOUNTNUM"));
					accountDTO.setUserName(rs.getString("USERNAME"));
					accountDTO.setProductNum(rs.getInt("PRODUCTNUM"));
					accountDTO.setAccountValance(rs.getInt("ACCOUNTVALANCE"));
					accountDTO.setAccountDate(rs.getDate("ACCOUNTDATE"));
					ar.add(accountDTO);
						
				}
				DBConnection.disConnect(rs, st, con);
				return ar;
				
			}
			//계좌상세정보 조회 - 회원의 특정계좌
			public void getDetail() throws Exception {
				Connection con = DBConnection.getConnection();
				String sql = "SELECT * FROM ACCOUNTS WHERE USERNAME = ?";
				PreparedStatement st = con.prepareStatement(sql);
				
				ResultSet rs = st.executeQuery();
				
				DBConnection.disConnect(rs, st, con);
				return;
				
				
				
			}
			
			
			
			//계좌 잔액 수정- 회원의 특정계좌의 잔액
			public void modi() throws Exception {
			Connection con = DBConnection.getConnection();
			String sql= "UPDATE ";
			PreparedStatement st = con.prepareStatement(sql);
			
			
			
			}
			
}
