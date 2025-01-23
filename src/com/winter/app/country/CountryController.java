package com.winter.app.country;

import java.util.Scanner;

public class CountryController {
	
	private CountryDAO countryDAO;
	
	public CountryController () {
		countryDAO = new CountryDAO();
	}
	

	public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1. 나라 리스트 출력");
			System.out.println("2. 나라 상세 정보 출력");
			System.out.println("3. 종료");
			int select = sc.nextInt();
			if(select==1) {
				countryDAO.getList();
			}else if(select==2) {
				countryDAO.getDetail();
			}else {
				break;
			}
			
		}
				
	}
	
}