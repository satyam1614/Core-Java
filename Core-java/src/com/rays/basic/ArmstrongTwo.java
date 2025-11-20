package com.rays.basic;

public class ArmstrongTwo {
	public static void main(String[] args) {
		
		int temp = 370;
		int i = 370;
		int r = 0;
		int reservNo = 0;
		
		while (i>0) {
			r =i % 10;
			reservNo = reservNo + r*r*r;
			i = i / 10 ;
		}
		
		System.out.println( reservNo + reservNo);
		if(temp == reservNo) {
			System.out.println( "reservNo");
		} else {
			System.out.println(" not reservNo");
		}
	}

}
