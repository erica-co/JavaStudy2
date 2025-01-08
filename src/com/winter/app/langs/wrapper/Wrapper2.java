package com.winter.app.langs.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("주민번호 입력");
			String birth=sc.next(); //971225-1234567
			// 연도 두 숫자를 먼저 꺼내오기 , subString
			String year = birth.substring(0,2);
			
			// 두 숫자 문자열을 숫자로 바꾸기
			int y = Integer.parseInt(year);
			
			System.out.println(y);
			y=1900+y;
			System.out.println(2025-y);
			
			
			
			
			
			

	}

}
