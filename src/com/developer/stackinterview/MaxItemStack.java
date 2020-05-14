package com.developer.stackinterview;

import java.util.Stack;

public class MaxItemStack {

	Stack<Integer> mainStack;
	Stack<Integer> maxStack;
	
	public MaxItemStack() {
		mainStack = new Stack<Integer>();
		maxStack = new Stack<Integer>();
	}
	
	public void push(int data) {
		this.mainStack.push(data);
		
		if(mainStack.size() == 1) {
			this.maxStack.push(data);
			return;
		}
		
		
		if(data > this.maxStack.peek())
		{
			this.maxStack.push(data);
		}
		else {
			this.maxStack.push(this.maxStack.peek());
		}			
	}
	
	public int getMax() {
		return this.maxStack.peek();
	}
	
	public int pop() {
		this.maxStack.pop();
		return this.mainStack.pop();
	}
}
