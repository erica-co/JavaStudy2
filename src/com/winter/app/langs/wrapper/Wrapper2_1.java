package com.winter.app.langs.wrapper;

import java.util.Scanner;

public class Wrapper2_1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("생일이 몇 월 달");
			String birth=sc.next(); //980101-1234567
			// 민증 뒷번호 첫 숫자를 먼저 꺼내오기 , charAt
			String month = birth.substring(2,5);
			
			// 두 숫자 문자열을 숫자로 바꾸기
			int y = Integer.parseInt(month);
			
			System.out.println(y);
			
			char ch = birth.charAt(4);
			
			if(ch == 3-5) {
				y=1900+y;
			}else {
			  
			  }
			}
			//System.out.println(20250+y);
			
			
			//봄 3-5월 여름 6-8월 가을 0-11월 겨울 12-2월

			
			
			
			
			

	}


