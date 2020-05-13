package com.developer.queues;

public class App {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(10);
		queue.enqueue(210);
		queue.enqueue(110);
		queue.enqueue(90);
		queue.enqueue(1980);
		
		queue.size();
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
}
