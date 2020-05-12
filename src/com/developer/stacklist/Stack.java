package com.developer.stacklist;

public class Stack<T extends Comparable<T>> {

	private Node<T> root;
	private int count;
	
	public void push(T data) {
		count++;
		if(this.root == null){
			this.root = new Node<>(data);
		}
		else {
			Node<T> oldRoot = this.root;
			this.root = new Node<>(data);
			this.root.setNextNode(oldRoot);
		}
	}
	
	public T peek(){
		return this.root.getData();
	}
	
	public T pop() {
		if(this.root == null)
			return null;
		 count--;
		 T popData = this.root.getData();
		 this.root = this.root.getNextNode();
		 return popData;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}
	
}
