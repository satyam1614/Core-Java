package com.rays.string;

public class StringAndStringBuffer {
	public static void main (String[] args) {
		
		String name = "Satyam";
		
		System.out.println(name);
		System.out.println(name.replace(('a'),('b')));
		System.out.println(name);
		
		
		System.out.println("--------------");
		
		
		StringBuffer sb = new StringBuffer("satyam");
		System.out.println(sb);
		System.out.println(sb.append("yadav"));
		System.out.println(sb);
	}

}
