package com.winter.app.langs;

public class Study2String {

	public static void main(String[] args) {
			System.out.println(String.CASE_INSENSITIVE_ORDER);
			
			String name = "winter"; //string 객체 생성
			//name = 참조변수- 원래는 주소가 들어가있음
			char ch = name.charAt(0); //매개변수 index / charAt은 문자를 빼온다는 뜻
			System.out.println(ch);
			
			System.out.println(name.length());
			
			for(int i=0;i<name.length();i++) {
				ch = name.charAt(i);
				System.out.println(ch);
			}
			
			//매개변수명 ch -> char -> 자동형변환
			int idx= name.indexOf('t');
			System.out.println(idx);
			
			idx = name.indexOf("in"); //-1 값은 없다라는 뜻
			System.out.println(idx);
			
			name.indexOf("t", 2);
			
			name = "Hello World";
			String find = "l";
			
			idx=name.indexOf(find,idx);
			int count =0;
			while(idx>=0) {
				
				idx=name.indexOf(find);
				if(idx>=0) {
					count++;
					idx++;//idx=idx+1
				}
			}
			System.out.println(count+"개 찾음");
			
			count=0;
			for(int i=0;i<name.length();i++) {
				if('l'==name.charAt(i)) {
					
				}
			}
			}
	
			
			
			
			
			
			
		
	}


