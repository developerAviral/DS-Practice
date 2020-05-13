package com.developer.queues;

public class Queue<T extends Comparable<T>> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	private int count;
	
	public Boolean isEmpty() {
		return this.firstNode == null;
	}
	
	public int size() {
		return count;
	}
	
	public void enqueue(T data) {
		this.count++;
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<>(data);
		this.lastNode.setNextNode(null);
		
		if(this.isEmpty()) {
			this.firstNode = this.lastNode;
		}
		else {
			oldLastNode.setNextNode(this.lastNode);
		}
	}
	
	public T dequeue() {
		this.count--;
		
		T dataToDequeu = this.firstNode.getData();
		this.firstNode = this.firstNode.getNextNode();
		
		if(isEmpty()) {
			 this.lastNode = null;
		}
		
		return dataToDequeu;
	}
}
