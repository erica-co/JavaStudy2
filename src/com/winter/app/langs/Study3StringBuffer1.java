package com.winter.app.langs;

public class Study3StringBuffer1 {

	public static void main(String[] args) {
		String str="a";
		str= str +"b";
		System.out.println(str); //StringBuffer 쓸데없는 객체를 더 생성 안 하게 함
		//문자를 더하는 기능
		
		StringBuffer sb = new StringBuffer();
		sb.append("a");
		sb.append("b");
		
		System.out.println(sb); //toString()

		str = sb.toString();
		

	}

}
