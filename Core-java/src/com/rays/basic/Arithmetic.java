package com.rays.basic;

public class Arithmetic {

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void substration(int a, int b) {
		System.out.println(a - b);
	}
	
	public String getFullName(String firstName,String lastName) {
		return firstName +  " " + lastName;	
	}
	
	public int getMaxNo(int a, int b){
		if (a>b) {
			return a;
		}else {
			return b;
		}
		
	}
		
	public int getMixNo(int a,int b) {
		if (a<b) {
			return a;
		}else {
			return b;
			
		}
	}
	
		
	}
		
 
		
	


