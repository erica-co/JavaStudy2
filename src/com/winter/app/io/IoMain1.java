package com.winter.app.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain1 {

	public static void main(String[] args) {
			
			//키보드로부터 입력
			//01 -> h,e,l,l,o -> hello
		    //0, 1 처리하는 클래스
			InputStream is = System.in ;
			
			//문자 관리
			InputStreamReader ir = new InputStreamReader(is);
			
			//보조스트림(문자열)
			BufferedReader br = new BufferedReader(ir);
			
			System.out.println("입력하세요");
			
			try {

				String str = br.readLine();
				System.out.println(str);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			} finally {
					//예외가 발생하든 안하든 무조건 하는 영역
		
				
			}
			
			
			System.out.println("프로그램 종료");
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
