package com.developer.stackarray;

public class Stack<T> {

	private T[] stack;
	private int numberOfItems;
	
	public Stack() {
		this.stack =(T[]) new Object[1];
	}
	
	public void push(T newData) {
		if(numberOfItems == this.stack.length) {
			resize(2* this.stack.length);
		}
		
		this.stack[numberOfItems++] = newData;
	}
	
	public T pop() {
		if(numberOfItems > 0 && numberOfItems == this.stack.length /4) {
			resize(this.stack.length/2);
		}
		
		T itemToPop = this.stack[--numberOfItems];
	//	this.stack[numberOfItems] = null;
		return itemToPop;
	}
	
	public T peek() {
		return this.stack[numberOfItems-1];
	}
	
	public boolean isEmpty() {
		return numberOfItems == 0;
	}
	
	public int size() {
		return numberOfItems;
	}
	
	private void resize(int capacity) {
		T[] tempArray =(T[]) new Object[capacity];
		for(int i=0; i< this.numberOfItems;++i) {
			tempArray[i] = stack[i];
		}
		stack = tempArray;		
	}
}
