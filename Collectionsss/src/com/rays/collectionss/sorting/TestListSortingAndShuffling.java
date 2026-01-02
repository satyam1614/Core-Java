package com.rays.collectionss.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestListSortingAndShuffling {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("satyam");
		list.add("abhishish");
		list.add("aditya");
		list.add("durgesh");
		
		System.out.println(list);
		
		System.out.println("------------");
		
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println("--------------");
		
		Collections.shuffle(list);
		
		System.out.println(list);
	}

}
