



package com.rays.encapsulation;

public class TestAutomobile {
	
	public static void main (String[] args) {
		 
		Automobile a1 = new Automobile();
		
		a1.setColour ("black");
		a1.setSpeed (80);
		a1.setMake ("bmw");
		
		System.out.println(a1.getColour());
		System.out.println(a1.getspeed());
		System.out.println(a1.getmake());
		
		
	}

}
