package com.rays.exception;

public class TestParentCatchBlock {
	
	public static void main(String[] args) {
		
		String name = "satyam";
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6));
		}catch(Exception e) {//Parent catch block
			System.out.println("exeception in catch1:" + e.getMessage());
			
		}
	}

}
