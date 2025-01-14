package com.winter.app.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
	
		public void add() {
			//도시명, 기온, 습도, 날씨상태를 입력받아서
			//sample.txt에 추가
			StringBuffer sb = new StringBuffer();
			System.out.println("도시명을 입력하세요");
			//String city = sc.next();
			
			System.out.println("기온을 입력하세요");
			//int  gion = sc.nextInt();
			System.out.println("습도를 입력하세요");
			//double h = sc.nextDouble();
			System.out.println("날씨 상태를 입력하세요");
			//String s = sc.next();
			//String result = name+"-"+gion+
			//도시명-기온-습도-상태
			this.output(null);
		}
	
		public void write() {
			
			Scanner sc = new Scanner(System.in);
			boolean check=true;
			while(check) { 
			System.out.println("입력");
			String data = sc.next();
			
			//end , exit, y, n
			if(!data.toLowerCase().equals("end")) {
				check = !check;
				break;
				
			}
			this.output(data);
			
			}
			sc.close();
		}
	
		private void output(String data) {
			System.out.println("호출");
			//파일에 내용을 출력
			File file = new File("C:\\test\\sample.txt");
			file = new File("C:\\test","sample.txt");
			FileWriter fw = null;
			try {
				//false : 기존의 파일을 삭제
				//true : 기존의 파일에 내용 추가
				fw = new FileWriter(file,true);
				System.out.println();
				fw.write("data");
				//buffer 초기화
				fw.write("\r\n");
				//buffer를 강제 비움
				fw.flush();
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
			
			
			
			
		}

}
