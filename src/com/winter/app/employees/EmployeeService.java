package com.winter.app.employees;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeeService {
	
	//의존성(Defendency)
		private EmployeeDAO employeeDAO;
		
		public EmployeeService() {
			
			//의존성 주입(Defendency injection : DI)
			employeeDAO = new EmployeeDAO();
		}
		
		//list
		public List<EmployeeDTO> getList(Scanner sc) throws Exception {
			System.out.println("검색어 입력");
				List <EmployeeDTO> ar = employeeDAO.getList(search); 
				return ar;
		}
		
		public void getInfo() throws Exception{
			Map<String,Object> map = employeeDAO.getInfo();		
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println(map.get(key));
			}
			
			
			
			
		}
}
