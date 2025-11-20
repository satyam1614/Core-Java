package com.rays.inhertiance;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main (String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 
		Businessman a1 =  new Businessman();
		
		a1.setName("satyam");
		
		a1.setAddress("indore");
		a1.setDob(sdf.parse("2000-06-09"));
		a1.setIncome(1000.00);
		
	     System.out.println(a1.getName());
	     System.out.println(a1.getAddress());
	     System.out.println(a1.getDob());
	     System.out.println(a1.getIncome());
	     
	     System.out.println("-----Docter----------");
	     
	     Docter d  = new Docter();
	     
	     d.setRegistrationNo("4567383399");
	     d.setName("vishal");
	     d.setDob(sdf.parse("2002-09-16"));
		 d.setAddress("bhopal");
		 
		 System.out.println(d.getRegistrationNo());
		 System.out.println(d.getName());
		 System.out.println(d.getDob());
		 System.out.println(d.getAddress());
		 
		 System.out.println("-----Student-------");
		 
		 
		 Student s =new Student();
		 
		 s.setName("sanju");
		 s.setDob(sdf.parse("2010-10-15"));
		 s.setMarks(20);
		 s.setAddress("itarsi");
		 s.setRollNo("ar10085");
		 
		 System.out.println(s.getName());
		 System.out.println(s.getDob());
		 System.out.println(s.getMarks());
		 System.out.println(s.getAddress());
		 System.out.println(s.getRollNo());
		 
		 
	}

}
