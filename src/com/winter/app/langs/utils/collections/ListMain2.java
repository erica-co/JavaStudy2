package com.winter.app.langs.utils.collections;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		//타입이 안전하지 않다
		//Element 변수
		//모으려고 하는 타입 선언
		// <> Generic  - 클래스,메서드에도 쓰임
		ArrayList <Integer> ar= new ArrayList<>(); 
		ar.add(3);
		ar.add(4);
		
		int n = ar.get(0);
		
		
		
		
		
		
//		if(ar.get(0) instanceof Integer) {
//			int n = (Integer)ar.get(0);			
//		}else if(ar.get(0) instanceof Double) {
//			double d = (Double) ar.get(0);
//		}
			
	}

}
