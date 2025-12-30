package com.rays.collectionss.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	
	public static void main(String[]args) {
		
		Queue q = new PriorityQueue();
		
		q.offer('a');
		//q.offer("hello");
		q.offer('b');
		q.offer('c');
		
		System.out.println(q);
	}

}
