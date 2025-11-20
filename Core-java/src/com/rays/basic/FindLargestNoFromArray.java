package com.rays.basic;

public class FindLargestNoFromArray {
	public static void main(String[] args) {
		 
	int [] a = { 5, 10, 15, 20, 25 } ;
	  int largestNo = 0;
	  for (int i = 0; i < a.length; i++) {
		  if (a[i] > largestNo) {
			  largestNo = a[i];
		  }
	  }
	  System.out.println("largestNo is:" + largestNo);
	}
	
}
