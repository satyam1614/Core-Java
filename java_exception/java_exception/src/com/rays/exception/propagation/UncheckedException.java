package com.rays.exception.propagation;

public class UncheckedException {
	
	public static void main(String[] args) {
		dad();
	}
	public static void dad() {
		mom();
	}
	public static void mom() {
		try {
			son();
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
     public static void son() {
    	 throw new RuntimeException("make a mistake");
     }
}
