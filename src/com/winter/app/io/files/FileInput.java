package com.winter.app.io.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileInput {
	
		
		public void input() throws Exception {
			File file = new File("C:\\test\\sample.txt");
			file = new File("C:\\test","sample.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			 
			while(true) {
				String data = br.readLine();
				if(data==null) {
						break;
				}
				
				StringTokenizer st = new StringTokenizer(data,"-");
				
				ArrayList<Weather> ar = new ArrayList<>();
				while(st.hasMoreTokens()) {
					String t = st.nextToken();
					//System.out.println(t);
					
					//Weather에 data 입력하고
					//Weather들을 모아서 리턴
					//main 메서드에 모든 내용을 출력
					Weather weather = new Weather();
					weather.setCity(t);
					t=st.nextToken();
					
				}
					
					
						
					
					
				}
				
			}
			
			br.close();
			fr.close();
			
		}
	
	
		

