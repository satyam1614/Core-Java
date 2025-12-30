package com.rays.collectionss.list;

import java.util.Stack;

public class TestStack {
	
	public static void main(String[]args) {
	
		
		Stack s = new Stack();
		
		
		for(char c = 'a' ; c <= 'z' ; c++) {
			
			
		s.push(c);	//add the element
	}
		
		System.out.println("stack" + s);
		
		System.out.println(s.peek());//only get last element from stack
		
		System.out.println("stack" +s);

		System.out.println(s.pop());//pop remove last element from stack
		
		System.out.println("stack"+s);
			}		
		
}
