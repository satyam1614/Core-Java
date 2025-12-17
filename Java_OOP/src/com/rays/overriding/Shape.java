package com.rays.overriding;

public class Shape {
	
	protected String colour;
	protected int BorderWidth;
	
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getBorderWidth() {
		return BorderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		BorderWidth = borderWidth;
	}
	
	public void area() {
		System.out.println("area method from shape class");
	}

	
	
}
