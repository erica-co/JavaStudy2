package com.winter.app.locations;

import com.winter.app.departments.DepartmentDTO;

public class LocationView {
	

		public void view (String message) {
			System.out.println(message);
		}
		
		public void view(LocationDTO locationDTO) {
			System.out.println("위치번호\t거리주소\t우편번호\t도시\t주\t나라번호");
			System.out.print(locationDTO.getLocation_id()+"\t");
			System.out.print(locationDTO.getStreet_address()+"\t");
			System.out.print(locationDTO.getPostal_code()+"\t");
			System.out.println(locationDTO.getCity()+"\t");
			System.out.println(locationDTO.getState_province()+"\t");
			System.out.println(locationDTO.getCountry_id());
		}

}
