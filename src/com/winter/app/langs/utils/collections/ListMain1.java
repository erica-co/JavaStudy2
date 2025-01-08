package com.winter.app.langs.utils.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain1 {

	public static void main(String[] args) {
		
		//ArrayListj
		ArrayList ar = new ArrayList();
		
		ar.add(1);
		ar.add('2');
		ar.add("three");
		ar.add(true);
		ar.add(new Scanner(System.in));
		
		ar.add(1, "hello"); //해당 index에 끼워놓고 남머지는 한칸싱은  안밀림
		
		ar.set(1,"world"); //해당 index의 값을 수정
		
		ar.remove(1); //해당 index 값 삭제
		
		boolean check = ar.contains(1);
		
		//ar.clear(); //모든 요소 삭제
		
		//System.out.println(ar.get(0)):
	    int a = ar.get(0);
		char ch = ar.get(1);
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//별개
		//향상된 for문
		//for(꺼낼데이터타입명 변수명 : collection변수명) {
		//
		//}
		
		int [] nums = {2,3,4,5};
		
		for(int n: nums) {
			System.out.println(n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
