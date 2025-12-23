package com.rays.exception.custom;



public class TestLoginException {
	
	public static void main(String[] args) throws LoginException  {
		
		String login = "satyam";
		
		if(login =="satyam123") {
			System.out.println("user found");
		}else {
			throw new  LoginException("invalid login id");
		}
	}
}
