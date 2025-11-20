package com.rays.string;

public class CountDigits {
	public static void main(String[] args) {
		 
		String str = "Sat1y5a67m";
		 
		int count = 0;
		for ( int i= 0; i < str.length(); i++) {
			if (Character.isDigit (str.charAt(i))){
				count++;
			}
		}
		System.out.println( "total digit in string:" + count);
	}

}
