package com.developer.stackinterview;

import java.util.Stack;

public class QueueUsingRecursion {

	private Stack<Integer> stack;
	
	public QueueUsingRecursion() {
		this.stack = new Stack<Integer>();
	}
	
	public void enqueue(int item) {
		this.stack.push(item);
	}
	
	public int dequeue() {
		if(this.stack.size() == 1)
			return this.stack.pop();
		
		int item = this.stack.pop();
		
		int lastItemToPop = this.dequeue();
		
		this.enqueue(item);
		
		return lastItemToPop;
	}
}

