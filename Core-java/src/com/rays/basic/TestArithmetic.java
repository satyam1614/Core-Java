package com.rays.basic;

public class TestArithmetic {
	public static void main (String[] args) {
		
	Arithmetic a = new Arithmetic();
	
	
	a.sum(5, 5);
	a.divide(10,2);
	a.substration(20,10);
	a.multiply(10,5);
	System.out.println(a.getFullName("satyam","yadav"));
	System.out.println(a.getMaxNo(5, 10));
	System.out.println(a.getMixNo(5, 10));
	}
}
