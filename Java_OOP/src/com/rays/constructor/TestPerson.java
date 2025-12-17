package com.rays.constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Person p1 = new Person("satyam", "indore", sdf.parse("2001-01-01"));
		
		System.out.println(p1.getName());
		System.out.println(p1.getAddress());
		System.out.println(sdf.format(p1.getDob()));
	}

}
