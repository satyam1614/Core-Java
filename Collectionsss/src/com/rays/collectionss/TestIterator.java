package com.rays.collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	
	public static void main (String[]args) {
		
		List list = new ArrayList();
		
		list.add("Orange");
	    list.add("Mango");
		list.add("Banana");
		list.add("Garpes");
		list.add("Papaya");
		
		System.out.println(list);
		
	    System.out.println("----------------");
	    
	    Iterator it = list.iterator(); //create ITerator object
	    
	    list.add("apple");//not fail-fast /fail-safe
	    
	    
	    while ( it.hasNext()) { //hasNext check the next element
	    	 Object  o = it.next(); //next iterate the next element
	    	 System.out.println(o); //print the next element
	    	 it.remove(); //remove the element
	    }
		System.out.println("--------------");
		System.out.println(list);
		
	}

}
