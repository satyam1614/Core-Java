package com.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class TestStream {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("uday");
		list.add("aman");
		list.add("vikas");
		list.add("raj");
		list.add("vishal");
		list.add("vishal");
		list.add("vishal");
		list.add("satyam");

		list.forEach(System.out::println);
		System.out.println("----------------");
		
		list.stream().sorted().forEach(System.out::println);
		System.out.println("-------------------");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("--------------------");
		list.stream().sorted().distinct().forEach(System.out::println);
		
		System.out.println("----------map method--------");
		list.stream().map(e -> e.toLowerCase()).distinct().forEach(System.out::println);
		
		System.out.println("--------------------");
		list.stream().map(e-> e.toUpperCase()).distinct().forEach(System.out::println);
		
		System.out.println("------fileter method--------------");
		list.stream().filter(e->e.startsWith("v")).distinct().forEach(System.out::println);

	}

}
