package com.winter.app.langs.utils.collections;

import java.util.HashSet;
import java.util.Random;

public class SetMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		HashSet<Integer> hash = new HashSet<>();
		
		for(int i=0;i<6;i++) {
			int num = random.nextInt(45)+1;
			boolean check = hash.add(num);
			if(!check) {
				i--;
			}
		}
			hash.clear();
			
//		while(hash.size() <6) {
//			 int num = random.nextInt(45)+1;
//			 hash.add(num);
			 
			 System.out.println(hash);
		}
	}


