
package com.rays.encapsulation;

public class TestAccount {
	
	public static void main (String [] args) {
		
		Account a1 = new Account ();
		
		a1.setNumber("388919168891");
		a1.setType("saving");
		a1.setBalance(5000.0);
		
		System.out.println(a1.getNumber());
		System.out.println(a1.getType());
		System.out.println(a1.getBalance());
		a1.Deposit(500);
		a1.withdrawl(1000);
		
	}
	
	

}
