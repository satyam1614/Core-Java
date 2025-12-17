package com.rays.inhertiance;

public class Circle extends Shape {
	
	private int radious;
	
	public void setRadious( int radius) {
		this.radious =radius;
	}
	public int getRadious() {
		return radious;
	}
	public double area(int radius) {

		double area = Math.PI * radius * radius;

		return area;

	}
 

}
