package com.winter.app.langs;

public class Study2String2 {

	public static void main(String[] args) {
			String str="  ";
			System.out.println(str.length());
			//글자수가 0인 것
			System.out.println(str.isEmpty());
			//글자수가 0 또는 스페이스바로만 이루어진 것
			System.out.println(str.isBlank());
			
			
			//replace
			//변경
			String r = str.replace(' ' ,'a' );
			System.out.println(str);
			System.out.println(r);  //스페이스바만큼 값이 변경되서 출력됨
			
			//abc ABC
			//대문자, 소문자로 전부 변경
			str="abc";
			r=str.toUpperCase() ;
			System.out.println(str);
			System.out.println(r);
			
			r= str.toLowerCase();
			System.out.println(str);
			System.out.println(r);
			
			//문자열 =문자배열
		char [] ch =str.toCharArray() ;
			//문자열 ->. 문자배열
		
		//문자열 앞뒤 공백제거
		str="win ter";
		System.out.println(str.length());
		System.out.println(str);
		r= str.trim();
		System.out.println(r.length());
		System.out.println(r);
		r=r.replace(" ","");
		System.out.println(r);
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
