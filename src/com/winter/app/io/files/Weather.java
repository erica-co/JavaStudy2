package com.winter.app.io.files;

public class Weather {
	
	private String city;
	private int gion;
	private double huminity;
	private String status;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getGion() {
		return gion;
	}
	public void setGion(int gion) {
		this.gion = gion;
	}
	public double getHuminity() {
		return huminity;
	}
	public void setHuminity(double huminity) {
		this.huminity = huminity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void info() {
		//멤버변수의 값을 출력하는 메서드
		System.out.println("도시"+getCity());
		System.out.println("기온"+getGion());
		System.out.println("습도"+getHuminity());
		System.out.println("상태"+getStatus());
	}
	
	

}
