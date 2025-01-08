package com.winter.app.langs.ex1;

public class PersonInfo {
	
		private String data;
		
		public PersonInfo() {
				this.data="iu,010-1234-5678,iu@naver.com,95-05-05";
				this.data=this.data+"winter,,010-2222-2222 , winter@gamil.com,01-02-21";
				this.data=this.data+"suji,010-3333-3333, suji@gmail.com,99-12-05";
				System.out.println(this.data);
		}
		//메서드명 init
		//data의 변수의 값을 파싱
		
		public void init () {
			this.data.split(",");
				String [] datas =this.data.split(",");
				
			
				//person 객체에 데이터를 대입
				//person 객체들을 리턴
				Person [] persons = new Person[datas.length/4];
				int idx= 0;
 				for(int i=0;i<datas.length;i=i+4) {
					Person person = new Person();
				
	            person.setName(datas[i]); // 4, 8, 12
				person.setPhone(datas[++i]); // 5, 9, 13
				person.setEmail(datas[++i]); // 6, 10, 14
				person.setBirth(datas[++i]); // 7, 11, 15
				persons[0]=person;
				
				}
				
				
				
				System.out.println();
			
				
			
				
				
				
				
				
				
				
				
				
				
				
				
		}
}
