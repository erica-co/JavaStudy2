package com.winter.app.langs.ex2;

import java.util.Scanner;

public class WeatherInfo {
	
		private StringBuffer info;
		
	  public WeatherInfo() {
		this.info = new StringBuffer();
		this.info.append("서울, 10, 0.3, 맑음");
		this.info.append("일산, -12, 0.56, 흐림");
		this.info.append("울산* 32* 0.95* 무더위");
		this.info.append("제주* 56* 0.02* 건조");
	}
	  
	  public void  init() {
		  //info의 정보를 파싱해서
		  //WeatherDTO에 담아서
		  //WeatherDTO들을 리턴
		  
		  
		  //System.out.println(this.info);
		  //1. split
		  //2. 구분자 통일
		  
		  String data = this.info.toString();
		  data = data.replace("*", ",");
		 // System.out.println(data);
		  
		  String [] datas = data.split(",");
		 WeatherDTO [] dtos = new WeatherDTO[datas.length/4];
		  
		  for(int i=0;i<datas.length;i++) {
			  WeatherDTO weatherDTO = new WeatherDTO();
			  dtos[i/4]=weatherDTO;
			 weatherDTO.setCity(datas[i].trim());
			 weatherDTO.setGion(Integer.parseInt(datas[++i].trim()));
			 weatherDTO.setHuminity(Double.parseDouble(datas[i++].trim()));
			 weatherDTO.setStatus(datas[++i].trim());
			 }
		  			//return dtos;
		 
	  }  
		  
			 public WeatherDTO findByName(WeatherDTO [] dtos, Scanner sc) {
				 System.out.println("검색할 도시명을 입력하세요");
				 String name = sc.next();
				 
				 for(int i=0;i<dtos.length;i++) {
					 	if(name.equals(dtos[i].getCity())) {
					 		return dtos[i];
					 	}
				 }
				
				 return null;
		  
		  
				 
		  }
					  
			  
			  

			  
			  
	  }
				 
		  
		 
		 
	
		  
		  
		  
		  
	  
