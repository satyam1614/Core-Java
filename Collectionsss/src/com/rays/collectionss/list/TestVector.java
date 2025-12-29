package com.rays.collectionss.list;

import java.util.List;
import java.util.Vector;

public class TestVector {
	
	public static void main(String[]args) {
		
		List v = new Vector();
		
		v.add(0,"ram");
		v.add(1,"ram");
		v.add(2,"shyam");
		v.add(3,null);
		v.add(4,null);
		v.add(5,4.2);
		v.add(6,'a');
		v.add(7,true);
		
		System.out.println(v);
		System.out.println(v.get(6));
	}

}
