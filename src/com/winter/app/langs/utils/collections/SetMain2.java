package com.winter.app.langs.utils.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member();
		m1.setName("winter");
		m1.setAge(24);
		
		Member m2 = new Member();
		m2.setName("iu");
		m2.setAge(32);
		
		ArrayList<Member> ar = new ArrayList<>();
		ar.add(m1);
		ar.add(m2);
		
		HashSet<Member> hs = new HashSet<>();
		hs.add(m1);
		hs.add(m2);
		
		Member m3 = new Member();
		m3.setName("winter");
		m3.setAge(24);
		
		ar.add(m1); 
		hs.add(m1);
		
		
		System.out.println(ar.size()); //ar은 중복 허용
		System.out.println(hs.size()); //hs는 중복 허용하지 않음
		
		System.out.println(ar.contains("winter")); //ar,hs는 주소를 포함하는 거지 String을 포함하지 않음
		System.out.println(hs.contains(m1)); //주소로 찾기
		
		
		
		
		
		
		
		

	}

}
