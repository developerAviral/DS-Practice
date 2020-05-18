package com.developer.interview.producerconsumer;

import java.util.Queue;

public class Consumer extends Thread{
	private Queue<Integer> queue;
	private int maxSize;
	
	
	
	public Consumer(Queue<Integer> queue, int maxSize, String name) {
		super(name);
		this.queue = queue;
		this.maxSize = maxSize;
	}



	@Override
	public void run() {
		while(true) {
			synchronized (queue) {
				while(queue.isEmpty()) {
					System.out.println("Producer queue is empty");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Consuming value: " +	queue.remove());
				queue.notifyAll();
			}
		}
	}

}
