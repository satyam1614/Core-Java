package com.rays.string;

public class TestName {
	public static void main(String[]args) {
		  
	String name = "Satyam yadav";
	 
	System.out.println(name);
	System.out.println(name.length());
	System.out.println(name.charAt(5));
	System.out.println(name.indexOf('y'));
	System.out.println(name.lastIndexOf('y'));
	System.out.println(name.replace('a' , 'c'));
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.startsWith("Satyam"));
	System.out.println(name.endsWith("dav"));
	System.out.println(name.substring(6 , 9 ));
	}

}

