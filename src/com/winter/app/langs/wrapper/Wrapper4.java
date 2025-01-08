package com.winter.app.langs.wrapper;

public class Wrapper4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		
		String str = Integer.toBinaryString(num); //0~9
		System.out.println(str);
		
		str = Integer.toHexString(num); //0~15 /10~15 abcdef로 표시됨
		System.out.println(str);
		
		str = Integer.toOctalString(num);
		System.out.println(str);
	}

}
