package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateForMating {
	
	public static void main(String[] args) {
		 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d = new Date();
		
		System.out.println( d );
		
		String s = sdf.format(d);
		
		System.out.println(s);
		
		
		
	}
	
	
	

}
