package com.winter.app.langs.wrapper;

import java.util.Scanner;

public class Wrapper3 {
	
			public static void main(String[] args) {
				Scanner sc= new Scanner(System.in);
				
				// 9 4  0 9 1 2 - 1 2 3 4 5 6 7
				//*2 3 4 5 6 7    8 9 2 3 4 5  마지막 번호는 검증용 번호
				//18 + 12 ........                         총합계 구하기
				//122
				//11로 나눈 나머지값 구하기 ex) 0~10
				//11-나머지 결과값 구하기
				// 나머지값을 검증용번호와 일치하는지 확인 1==7
				// 만약에 나머지 값이 두자리 수라면
				// 나머지 값을 다시 10으로 나눈 나머지값을 구하기
				//나머지값을 검증용번호와 일치하는지 확인
				int count=2;
				int sum=0;
				System.out.println("주민번호 입력하세요");
				String jumin = sc.next();
				if (jumin.length() < 14 || jumin.length() >14) {
					System.out.println("다시 입력하세요");
				}
				for(int i=0;i<jumin.length()-1;i++) {
					char ch =jumin.charAt(i);
					//String num = jumin.substring(i,i+1);
					//int n = Integer.parseInt(num);
					int n = Integer.parseInt(String.valueOf(ch));
					sum=sum+n*count;
					
					System.out.println(n*2);
					
				}
				
				sum=sum%11;
				sum=11-sum;
				
				
					
				}
				
				
				
			}


