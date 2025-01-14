package com.winter.app.network.ex.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.winter.app.io.files.Weather;

public class WeatherController {
	Scanner sc = new Scanner(System.in);
	
		public void start() throws UnknownHostException, IOException {
			Socket socket =  new Socket("192.168.200.16", 8282);
			System.out.println("시스템과 접속 성공");
			
				//1. 날씨정보출력
				//2. 종료
			boolean check =true;
			while(true) {
				System.out.println("1. 날씨 정보 출력");
				Weather weather = new Weather();
				
				System.out.println("2. 종료");
				
			}
			
			
			
		}

}
