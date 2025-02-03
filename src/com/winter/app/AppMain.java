package com.winter.app;

import java.util.UUID;

public class AppMain {

	public static void main(String[] args) {
		// 프로그램 실행 또는 테스트 코드 실행
		//universal unique identified 
		String id = UUID.randomUUID().toString();
		System.out.println(id); //절대 중복되지 않음

	}

}
