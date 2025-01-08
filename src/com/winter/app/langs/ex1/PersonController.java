package com.winter.app.langs.ex1;

import java.util.Scanner;

public class PersonController {
	
		public void start () {
			// 1. 주소록 초기화
			// 2. 주소록 출력
			// 3. 검색(이름, PathInfo.find()) - equals 메서드 사용
			// 4. 주소록 정보 추가
			// 5. 주소록 삭제(이름으로 검색 후 삭제)
			// 6. 종료
			
			Scanner sc = new Scanner(System.in);
			boolean check = true;
			PersonView pv = new PersonView();
			PersonInfo pi = new PersonInfo();
			PersonController pc = new PersonController();
			
			while(check) {
				System.out.println("1. 주소록 초기화  2. 주소록 출력  3. 검색");
				int select = sc.nextInt();
				if(select ==1) {
					
				}else if (select == 2) {
					
				}else if (select == 3) {
					
				}else {
					System.out.println("종료");
					break;
				}
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
		}

}
