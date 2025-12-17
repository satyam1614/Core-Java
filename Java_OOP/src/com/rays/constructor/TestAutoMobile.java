package com.rays.constructor;

public class TestAutoMobile {
	
	public static void main(String[] args) {
		
		AutoMobile ab = new AutoMobile("satyam",40,"tata");
		
		System.out.println(ab.getColour());
		System.out.println(ab.getSpeed());
		System.out.println(ab.getMake());
		
		
	}

}
