package com.rays.collectionss;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("Orange");
	    v.add("Mango");
		v.add("Banana");
		v.add("Garpes");
	    v.add("Papaya");
	   
	    Enumeration e = v.elements();
	    
	    v.add("apple");//not fail-fast /fail- safe
	    
	    while(e.hasMoreElements()) {
	    	Object o = e.nextElement();
	    	System.out.println(o);
	    }
	}

}
