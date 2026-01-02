package com.rays.map;

import java.util.HashMap;
import java.util.Map;

//1. map contain key and value pair
//2. in map key represent value
//3. map contain unique key only
//4. map contain duplicate value
//5. map contain only one null key
//6. map contain multiple null value

public class TestMap {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put("five", 5);
		
		System.out.println(m);
		System.out.println(m.get("two"));
		System.out.println(m.containsKey("six"));// containskey check key members
		System.out.println(m.containsKey("five"));
		System.out.println(m.containsValue(6));// containsvalue check value members
		System.out.println(m.containsValue(5));
		System.out.println("--------------");
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		System.out.println("--------------");
		System.out.println(m.remove("five"));
		System.out.println(m);
		m.clear();
		System.out.println(m);
	}

}
