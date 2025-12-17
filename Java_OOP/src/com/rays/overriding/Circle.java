package com.rays.overriding;

public class Circle extends Shape {
	
	private int radious;

	public int getRadious() {
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}
	
	@Override
	public void area() {
		
		System.out.println("area of circle:" +3.14 * radious*radious);
		
	
	}
	
}
