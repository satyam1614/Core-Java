package com.rays.collectionss;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethod {
	
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add("ram");
		c1.add(6);
		c1.add(2.5);
		c1.add("b");
		c1.add(true);
		
		System.out.println("c1:" + c1);
		System.out.println("c1 size:" + c1.size());
		
		System.out.println("-------------");
		
		Collection c2 = new ArrayList();
		
		c2.add("shyam");
		c2.add(5);
		c2.add(5.3);
		c2.add("a");
		c2.add(false);
		
		System.out.println("c2:" + c2);
		System.out.println("c2 size:" + c2.size());
		
		System.out.println("--------------");
		
		System.out.println(c1.containsAll(c2));
		c1.addAll(c2);
		System.out.println(c1.containsAll(c2));
		System.out.println("c1 after addall c2:" + c1);
		c1.removeAll(c2);
		System.out.println("c1 after remove all c2;" + c1);
		System.out.println("c1 is empty:" + c1.isEmpty());
		c1.clear();
		System.out.println("c1 is empty:" + c1.isEmpty());
		
	}

}
