

package com.rays.encapsulation;

public class Account {
	
	private String number;
	private String type;
	private Double balance;
	
	public void setNumber (String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public void setType (String type) {
		this.type = type;
	}
	
	public String getType () {
		return this.type;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getBalance() {
		return this.balance;
	}
	public void Deposit (int amount) {
		balance = balance + amount;
		System.out.println( balance);
	}
	public void withdrawl ( int amount) {
		if (amount>balance) {
			System.err.println("insufficent balance");
		}
		else {
			balance = balance - amount;
			System.out.println(balance);
		}
	}
			
			public void fundTransfer(Account accountToTransfer, double amount) {
				if (amount > 0 && amount <= balance) {
					balance = balance - amount;
					accountToTransfer.balance = accountToTransfer.balance + amount;
					System.out.println("Transferred " + amount + " to " + accountToTransfer.getNumber());
					System.out.println("Your New Balance: " + this.balance);
				} else {
					System.out.println("Transfer failed. Insufficient funds or invalid amount");
				
				}
	}

}
