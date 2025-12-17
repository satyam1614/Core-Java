package com.rays.Ploymorphism;

public class TestPolymorphismUsingReturnType {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape [3];
		
		s[0] = Shape.getshape(1);
		s[1] = Shape.getshape(2);
		s[2] = Shape.getshape(3);
		
		Circle c = (Circle)s[0];
		c.setRadius(5);
		
		Rectangle r =(Rectangle) s[1];
		r.setLenght(6);
		r.setWidth(10);
		
		Triangle t =(Triangle) s[2];
		t.setBase(3);
		t.setHeight(5);
		
		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}

}
