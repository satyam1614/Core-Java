package com.rays.constructor;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a1 = new Account("38891916991","current",1000);
		
		System.out.println(a1.getAccNumber());
		System.out.println(a1.getAccType());
		System.out.println(a1.getBalance());
		
		System.out.println("-------------");
		
		Account a2 = new Account("27288374628","saving",50000);
		
		System.out.println(a2.getAccNumber());
		System.out.println(a2.getAccType());
		System.out.println(a2.getBalance());
		
		
	}

}
