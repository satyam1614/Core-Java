
package com.rays.encapsulation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	 public static void main (String [] args) {
		 
		 Date d = new Date();
		 
		 Person p1 = new Person();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		 
		 
		 p1.setName ("satyam");
		 p1.setDob(d);
		 p1.setAddress("indore");
		 
		 System.out.println(p1.getName());
		 System.out.println(p1.getDob());
		 System.out.println(p1.getAddress());
		
		 
	 }
}
