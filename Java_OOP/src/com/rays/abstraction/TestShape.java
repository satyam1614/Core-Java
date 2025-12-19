package com.rays.abstraction;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s1 = new Circle();
		
		Circle c = (Circle) s1;
		c.setRadius(2);
		System.out.println("area of circle:" + c.area());
		
		Shape  s2 = new Rectangle();
		
		Rectangle r = (Rectangle) s2;
		r.setLenght(4);
		r.setWidth(8);
		System.out.println("area of triangle;" + r.area());
		
		Shape s3 = new Triangle ();
		
		Triangle t = (Triangle) s3;
		t.setBase(5);
		t.setHeight(10);
		System.out.println("area of rectangle:" + r.area() );
		
		
	}

}
