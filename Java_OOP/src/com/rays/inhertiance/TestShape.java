
package com.rays.inhertiance;

public class TestShape {
	
	public static void main (String[] args) {
		
	 Circle c1 = new Circle();
	 
	 c1.setRadious(5);
	 c1.setColour("black");
	 c1.setBorderWidth(10);
	 
	 System.out.println(c1.getRadious());
	 System.out.println(c1.getColour());
	 System.out.println(c1.getBorderWidth());
	 System.out.println(c1.area(6));
	 
	 
	 
	 System.out.println("----Rectangel-----");
	 
	  Rectangle r = new Rectangle();
	  
	  r.setLength(10);
	  r.setWidth(5);
	  r.setBorderWidth(20);
	  r.setColour("blue");
	  
	  System.out.println(r.getLength());
	  System.out.println(r.getWidth());
	  System.out.println(r.getBorderWidth());
	  System.out.println(r.getColour());
	  System.out.println(r.area(10, 5));
	  
	  
	  
	  System.out.println("-----Triangle------");
	  
	  Triangle t = new Triangle();
	  
	 t.setbase(5);
	 t.setBorderWidth(10);
	 t.setColour("red");
	 t.setHeight(15);
	 
	 System.out.println(t.getBase());
	 System.out.println(t.getBorderWidth());
	 System.out.println(t.getColour());
	 System.out.println(t.getHeight());
	 System.out.println(t.area());
	 
	 
	 
	 
	 
	 
	 
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}
	
	
	

}




