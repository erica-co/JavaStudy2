package com.winter.app.langs;

import java.util.Scanner;

public class Study2String5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//String 불변성
		
		String name1 = "iu"; //name1 - 참조변수
		String name2 = "iu";
		String name3 = new String("iu");
		String name4 = sc.next();
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name1==name4);
		System.out.println(name3==name4);
		
		name1 = name1+"hi"; //변경된 것처럼 보이지만 새로운 객체를 생성한 것
		
		name1.substring(3); //3번부터 끝번까지 추출하라
		
		
		System.out.println(name1+234+'a');

	}

}
