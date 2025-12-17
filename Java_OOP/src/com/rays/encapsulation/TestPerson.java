
package com.rays.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	 public static void main (String [] args) throws ParseException {
		 
		 Person p1 = new Person();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 
		 
		 p1.setName ("satyam");
		 p1.setDob(sdf.parse("2000-10-14"));
		 p1.setAddress("indore");
		 
		 System.out.println(p1.getName());
		 System.out.println(sdf.format(p1.getDob()));
		 System.out.println(p1.getAddress());
		 System.out.println(p1.getAge(p1.getDob()));
		
		 
	 }
}
