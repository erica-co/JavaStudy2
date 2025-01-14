package com.winter.app.langs.utils.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {

	public static void main(String[] args) {
			// List, Set => Collection 이 부모
			// Map => K String 많이 씀
				 HashMap<String, Integer> map = new HashMap<>();
			 //추가 put
				 map.put("k1", 100);
				 map.put("k2", 200);
				 map.put("k3", 300);
				 
				 map.put("k2", 400); //수정
				 
				 
				 System.out.println(map);
				 System.out.println(map.size());
				 System.out.println(map.get("k3"));
				 System.out.println(map.containsKey("k1"));
				 System.out.println(map.get("k0"));
				 
				  Iterator<String>keys = map.keySet().iterator();
				 
				 while(keys.hasNext()) {
					 String k= keys.next();
					 System.out.println("Key : "+k);
					 Integer v =map.get(k);
					 System.out.println("Value : "+v);
				 }
				 
				 
				 
				 
				 
				 
				 
				 
				 
	}

}
