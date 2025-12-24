package com.rays.collectionss;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionONE {
	
	public static void main(String[] args) {
		
		Collection d = new ArrayList();
		
		d.add("bura mat dekho");
		d.add("bura mat suno");
		d.add("bura mat kaho");
		
		System.out.println(d);
		System.out.println(d.size());

		System.out.println("-------------");
		
		for(Object o : d) {
			System.out.println(o);
		}
	}

}
