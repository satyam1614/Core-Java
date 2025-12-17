package com.rays.Ploymorphism;

public class Shape {
	
	protected String color;
	protected int borderWidth;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public void area() {
		System.out.println("area of from shape class");
	}
	public static Shape getshape( int i) {
		if (i == 1) {
			return new Circle();
		}
		if (i ==2) {
			return new Rectangle();
		}
		if ( i ==3) {
			return new Triangle();
		}
		return new Shape();
		
		
	}

}
