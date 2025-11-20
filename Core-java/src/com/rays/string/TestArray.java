package com.rays.string;

public class TestArray {
	public static void main(String[]args) {
		  
		String name = "Vijay Dinanath chouhan";
		
		 System.out.println("name = " + name);
		 System.out.println("length:" + name.length ());
		 System.out.println("7th char is:" + name.charAt (6));
		 System.out.println("first index of a:" + name.indexOf('a'));
		 System.out.println("last index of a:" + name.lastIndexOf('a'));
		 System.out.println(name.replace('a','b'));      // replace oldchar (a) with newchar (b)
		 System.out.println("chota vijay:" + name.toLowerCase());
		 System.out.println("bada vijay ;" + name.toUpperCase());
		 System.out.println(name.startsWith("vijay"));
		 System.out.println(name.endsWith("han"));
		 System.out.println(name.substring(6 , 9));
	}

}
