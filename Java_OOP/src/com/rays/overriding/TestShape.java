package com.rays.overriding;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s1 = new Circle();
		
		Circle c= (Circle) s1;
		
		c.setColour("blue");
		c.setBorderWidth(2);
		c.setRadious(4);
		
		System.out.println("colour:" + c.getColour());
		System.out.println("borderwidth" + c.getBorderWidth());
		System.out.println("radious" + c.getRadious());
		c.area();
		
		System.out.println("--------------");
		
		Shape s2 = new Rectangle();
		
		Rectangle r = (Rectangle) s2;
		
		r.setColour("yellow");
		r.setBorderWidth(10);
		r.setLength(5);
		r.setWidth(6);
		
		System.out.println("colour:" + r.getColour());
		System.out.println("borderwidth:" + r.getBorderWidth());
		System.out.println("lenght:" + r.getLength());
		System.out.println("width:" + r.getWidth());
		r.area();
		
		System.out.println("--------------");
		
		Shape s3 = new Triangle();
		
		Triangle t = (Triangle) s3;
		
		t.setColour("red");
		t.setBorderWidth(4);
		t.setHeight(8);
		t.setBase(2);
		
		System.out.println("colour:" + t.getColour());
		System.out.println("borderwith:" + t.getBorderWidth());
		System.out.println("height;" + t.getHeight() );
		System.out.println("base:" + t.getBase());
		t.area();
		
		
		
		
	}
}
