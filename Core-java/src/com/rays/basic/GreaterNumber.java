package com.rays.basic;

public class GreaterNumber {
	public static void main (String[] args) { 
		int sum =0;
		
		for (int a = 100; a < 200; a++) {
			if (a % 7 == 0) {
			System.out.println("divided by seven:" + a);
			sum = sum + a;
			}
			}
		System.out.println(sum);
	}

		
}
