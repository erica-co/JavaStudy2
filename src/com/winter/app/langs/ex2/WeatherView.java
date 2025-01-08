package com.winter.app.langs.ex2;

import java.util.ArrayList;

public class WeatherView {
		
		private void view() {
			//WeatherDTO들의 정보를 출력
				System.out.println("도시명\t기온\t습도\t날씨\t");
		}
		
		public void view(String message) {
			System.out.println(message);
		}
				
				public void view (WeatherDTO weatherDTO) {
					this.view();	
					System.out.print(weatherDTO.getCity()+"\t");
					System.out.print(weatherDTO.getGion()+"\t");
					System.out.print(weatherDTO.getHuminity()+"\t");
					System.out.println(weatherDTO.getStatus());
				}
					
				public void view (ArrayList<WeatherDTO> ar) {
					this.view();
					
					for(int i=0;i<ar.size();i++) {
						System.out.println(ar.get(i).getCity()+"\t");
						System.out.println(ar.get(i).getGion()+"\t");
						System.out.println(ar.get(i).getHuminity()+"\t");
						System.out.println(ar.get(i).getStatus());
					}
					}
				
				
				
				
				
				
				
				
				
				}
		
