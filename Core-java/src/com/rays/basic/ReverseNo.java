package com.rays.basic;

public class ReverseNo {
	public static void main(String[] args) {
		 
		int i = 123;
		int r = 0;
		int reverseNo = 0;
		 
		while  (i > 0) {
			r = i % 10;
			reverseNo = (reverseNo *10 )+ r;
			i = i/10;
			
		}
		System.out.println("reverseNo: " + reverseNo);
		
		
	}

}


