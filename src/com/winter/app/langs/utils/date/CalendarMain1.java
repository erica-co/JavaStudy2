package com.winter.app.langs.utils.date;


import java.util.Calendar;
import java.util.Date;

public class CalendarMain1 {

	public static void main(String[] args) {
		//현재 날짜와 시간을 가지는 객체 생성
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		Date date = calendar.getTime();
		System.out.println(date);
		
		//년도
		int y = calendar.get(Calendar.YEAR);
		System.out.println(y);
		
		//월
		int m = calendar.get(Calendar.MONTH);
		System.out.println(m+1); //month는 +! 해주기
		
		//일
		int d = calendar.get(Calendar.DATE);
		System.out.println(d);
		
		//시
		int h = calendar.get(Calendar.HOUR);
		System.out.println(h);
		h = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(h);
		
		//분
		int b = calendar.get(Calendar.MINUTE);
		System.out.println(b);
		
		//초
		int s = calendar.get(Calendar.SECOND);
		System.out.println(s);
		
		//밀리세컨즈(1/1000)
		int mil = calendar.get(Calendar.MILLISECOND);
		System.out.println(mil);
		
		
		
		
		
		
		
		
		
	}

}
