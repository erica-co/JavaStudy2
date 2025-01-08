package com.winter.app.langs;

public class Study2String3 {

	public static void main(String[] args) {
			String number = "010-1234-5678";
			
			//substring
			//문자열에서 일부분을 추출할 때
			//문자열에서 일부분을 추출할 때 사용
			String n = number.substring(9);
			System.out.println(n);
			
			//Substring(idx1, idx2) : idx1부터 idx2 미만 까지 number}
			n=number.substring(4,8);
			System.out.println(n);
			String name = "winter.jpg";
			int idx = name.lastIndexOf(".");
			name= name.substring(idx+1);
			System.out.println(name);
			
			name="99123-1234567";
			 //name.charAt(7);
			// name.charAt(name.indexOf("-")+1)
			 if(name.equals("1") || name.equals("3")) {
				 System.out.println("남자");
			 }else {
				 System.out.println("여자");
			 }
			
			
			
			
			
}
}
