package com.rays.Ploymorphism;

public class TestPolymorphismUsingArray {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		
		s[0]  = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		Circle c = (Circle) s[0];
		c.setBorderWidth(5);
		c.setColor("red");
		c.setRadius(10);
		
		Rectangle r = (Rectangle) s[1];
		r.setBorderWidth(2);
		r.setColor("blue");
		r.setLenght(4);
		r.setWidth(6);
		
		Triangle t = (Triangle) s[2];
		t.setBorderWidth(6);
		t.setColor("yellow");
		t.setBase(8);
		t.setHeight(4);
		
		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
		
	}

}
