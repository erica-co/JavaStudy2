package com.winter.app.users;

import java.util.Scanner;

public class UserInput {

			// 가입정보 입력
			public UserDTO join(Scanner sc) {
				UserDTO userDTO = new UserDTO();
				System.out.println("ID를 입력하세요");
				userDTO.setUserName(sc.next());
				System.out.println("PW를 입력하세요");
				userDTO.setPassWord(sc.next());
				System.out.println("NAME을 입력하세요");
				userDTO.setName(sc.next());
				System.out.println("전화번호를 입력하세요");
				userDTO.setPhone(sc.next());
				System.out.println("이메일을 입력하세요");
				userDTO.setEmail(sc.next());
				
				return userDTO;
			}
			
			//로그인 정보
			public UserDTO login(Scanner sc) {
				UserDTO userDTO = new UserDTO();
				System.out.println("ID를 입력하세요");
				userDTO.setUserName(sc.next());
				System.out.println("PW를 입력하세요");
				userDTO.setPassWord(sc.next());
				
				return userDTO;
			}
			
}
