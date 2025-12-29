package com.rays.exception;

public class TestArithmeticWthTryCatch {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 16;
		
		try {
			int div = b / a;
			System.out.println(div);
		}catch( ArithmeticException e) {
			System.out.println("exception:" + e.getMessage());
			}
		System.out.println("programe is final");
		
	}

}
