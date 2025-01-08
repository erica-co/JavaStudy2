package com.winter.app.langs.utils.tokens;

import java.util.StringTokenizer;

public class TokenMain {

	public static void main(String[] args) {
		// 클래스 담을 변수 선언
		// 같은 패키지내에 있는가 또는 java.lang 에 있는가 찾기
		// import 안하고 사용가능
		
		// 하나의 문자열을 여러개의 문자열로 분리 : parsing
		// 분리한 문자열 하나하나를 Token이라고 부름
		
		String data="iu-173.2-59.3-서울";
		StringTokenizer st = new StringTokenizer(data,"-"); //(분리하고자 하는 것, 분리하는 기준)
		int count = st.countTokens();
		System.out.println(count);
		
		boolean check = st.hasMoreTokens();
		
		while(st.hasMoreTokens()) {
				
				String t = st.nextToken();
				System.out.println(t);
				
//		String data = "rose,168,50,서울";
//		StringTokenizer st = new StringTokenizer(data,",");
//		int count = st.countTokens();
//		System.out.println(count);
//		
//		boolean check = st.hasMoreTokens();
//		
//		while(st.hasMoreTokens()) {
//			
//			String tt = st.nextToken();
//			System.out.println(tt);
		}
				
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}


