package com.developer.stackinterview;

import java.util.Stack;

public class QueueUsingStack {

	private Stack<Integer> enqueue;
	private Stack<Integer> dequeue;
	
	public QueueUsingStack() {
		enqueue = new Stack<Integer>();
		dequeue = new Stack<Integer>();
	}
	
	public void enqueue(int item) {
		this.enqueue.push(item);
	}
	
	public int dequeue() {
		if(this.enqueue.isEmpty() && this.dequeue.isEmpty())
			throw new RuntimeException("Stack is empty");
		
		if(this.dequeue.isEmpty()) {
			
			while(!enqueue.isEmpty()) {
				this.dequeue.push(this.enqueue.pop());
			}
		}
		return this.dequeue.pop();
	}
}
