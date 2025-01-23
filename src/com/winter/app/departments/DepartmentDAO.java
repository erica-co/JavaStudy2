package com.winter.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.utils.DBConnection;

public class DepartmentDAO {
		//DAO -> Data Access Object
		//DB에 Data를 조회하거나, 입력, 수정, 삭제 기능
	
		//1. 접속정보선언
		//2. connection
	 	//3. SQL문 생성
		//4. 미리보내기
		//5.
		//6. 최종 전송 및 결과 처리
		//7. 연결 해제
		public List<DepartmentDTO> getList() throws Exception {
				Connection con = DBConnection.getConnetion();
				String sql="SELECT * FROM DEPARTMENTS ORDER BY 2 DESC";
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs = st.executeQuery();
				List<DepartmentDTO> ar = new ArrayList<>();
				while (rs.next()) {
					DepartmentDTO departmentDTO = new DepartmentDTO();
					departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
					departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
					departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
					departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
					ar.add(departmentDTO);
				}
				
				DBConnection.disConnect(rs, st, con);
				return ar;
		}
	
		
		public DepartmentDTO getDetail(DepartmentDTO departmentDTO2) throws Exception {
			DepartmentDTO departmentDTO=null;
			Connection connection = DBConnection.getConnetion();
			String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID=?";
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet  rs = st.executeQuery();
			if(rs.next()) {
				departmentDTO = new DepartmentDTO();
				departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
				departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
				departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
				departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			}
			
			DBConnection.disConnect(rs, st, connection);
			
			return departmentDTO;
		}
		
		public DepartmentDTO getName() throws Exception{
			Connection con = DBConnection.getConnetion();
			String sql = "SELECT DEPARTMENT_NAME"
					+ "FROM DEPARTMENTS"
					+ "WHERE DEPARTMENT_ID ="
					+ "("
					+ "		SELECT DEPARTMENT_ID FROM EMPLOYEES"
					+ "		WHERE FIRST_NAME='Lex'"
					+" )";
			
			PreparedStatement st = con.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			DepartmentDTO departmentDTO=null;
			if(rs.next()) {
				departmentDTO = new DepartmentDTO();
				departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
				
			}
			DBConnection.disConnect(rs, st, con);
			
			return departmentDTO;
			
		}
			public int add(DepartmentDTO departmentDTO) throws Exception{
				Connection connection =  DBConnection.getConnetion();
				String sql = "INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID"
						+ " VALUES (DEPARTMENTS_SEQ.NEXTVAL,?,?,?)";
						
				PreparedStatement st = connection.prepareStatement(sql);
				st.setString(1, departmentDTO.getDepartment_name());
				st.setInt(2, departmentDTO.getManager_id());
				st.setInt(3, departmentDTO.getLocation_id());
				
				//최종 전송 (insert, update, delete)-resultset이 없어서 disconnection 2개만 하면 됨
				//결과 int , 메서드는 executeUpdate
				int result = st.executeUpdate();
				
				DBConnection.disConnect(st, connection);
			
				return result;
				
			}
		
			public int update(DepartmentDTO departmentDTO) throws Exception {
				//하나의 부서에 매니저번호 수정
			Connection connection = DBConnection.getConnetion();
			String sql = "UPDATE DEPARTMENTS SET MANAGER_ID=? WHERE DEPARTMENT_ID=? ";
				
			PreparedStatement st = connection.prepareStatement(sql);
			
			st.setInt(1, departmentDTO.getManager_id());
			st.setInt(2, departmentDTO.getDepartment_id());
			
			int result = st.executeUpdate();
			
			DBConnection.disConnect(st, connection);
			
			return result;

			}
			
			public int delete(DepartmentDTO departmentDTO)throws Exception{
				Connection connection = DBConnection.getConnetion();
				String sql = "DELETE DEPARTMENTS WHERE DEPARTMENT_ID=?";
				
				PreparedStatement st = connection.prepareStatement(sql);
				st.setInt(1, departmentDTO.getDepartment_id());
				
				int result = st.executeUpdate();
						
				DBConnection.disConnect(st, connection);
				
				return result;
				
				
				
				
				
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
	

}
