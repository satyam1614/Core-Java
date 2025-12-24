
package com.rays.collectionss;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("ram");
		c.add(3);
		c.add(3.2);
		c.add('a');
		c.add("true");
		
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.contains('b'));
		System.out.println(c.remove('a'));
		
		System.out.println("----------");
		
		for(Object o : c) {
			System.out.println(o);
		}
		
	}

}
