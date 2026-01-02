package com.rays.collectionss.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
	

	public static void main(String[] args) {
		
	Marksheet m1 = new Marksheet("ram", 101, 55);
	Marksheet m2 = new Marksheet("shyam", 103, 45);
	Marksheet m3 = new Marksheet("pawan", 105, 33);
	Marksheet m4 = new Marksheet("aditya", 102, 65);
	Marksheet m5 = new Marksheet("rahul", 106, 95);
	Marksheet m6 = new Marksheet("sonu", 104, 85);
	
	ArrayList<Marksheet> list = new ArrayList<Marksheet>();
	
	list.add(m1);
	list.add(m2);
	list.add(m3);
	list.add(m4);
	list.add(m5);
	list.add(m6);
	
	System.out.println(list);
	
	Collections.sort(list);
	
	System.out.println(list);
	}

} 

