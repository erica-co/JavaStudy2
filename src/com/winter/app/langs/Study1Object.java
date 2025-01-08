package com.winter.app.langs; 

public class Study1Object {

	public static void main(String[] args) {
			Object obj = new Object();
			//참조변수 명.변수명, 메서드명
			//문서에 생략되어 있으면 public 
			String s =obj.toString();
			
			System.out.println(s);
			System.out.println(obj);
			ObjectTest ot = new ObjectTest();
			
			Object obj2 = new Object();
			
			boolean result =obj.equals(obj2);
			System.out.println(obj == obj2); // equals 참조변수 두개를 비교하는 역할
			System.out.println(result);
			
			String name = "winter"; //원래 string은 reference 타입어서 바로 안되지만 String은 많이 써서 가능
			String name2 = new String("winter"); // 원래 reference 선언하는 방식
			System.out.println(name==name2); //주소비교
			result = name.equals(name2);
			System.out.println(result); 
			
			//===========================================
			ot.num1=10;
			ot.m1();
			String str = ot.toString();
			System.out.println(str);
			System.out.println(ot);
			System.out.println(name2); //원래는 주소가나와야하나 overiding 해서 winter가 나옴
			System.out.println(name2.hashCode());
			
			
			
			
	}

}
