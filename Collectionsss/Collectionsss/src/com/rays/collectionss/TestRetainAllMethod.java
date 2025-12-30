package com.rays.collectionss;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAllMethod {
	
	public static void main(String[] args) {
		
	Collection c1 = new ArrayList();
	
	c1.add("ram");
	c1.add("kamal");
	c1.add("pawan");
	
	Collection c2 = new ArrayList();
	
	c2.add("ram");
	c2.add("raman");
	c2.add("baman");
	
	c1.retainAll(c2);
	
	System.out.println(c1);
		
	}

}
