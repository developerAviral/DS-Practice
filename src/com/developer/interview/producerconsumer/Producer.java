package com.developer.interview.producerconsumer;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread{

	private Queue<Integer> queue;
	private int maxSize;
	
	
	
	public Producer(Queue<Integer> queue, int maxSize, String name) {
		super(name);
		this.queue = queue;
		this.maxSize = maxSize;
	}


	@Override
	public void run() {
		while(true) {
			synchronized (queue) {
				while(queue.size() == this.maxSize) {
					System.out.println("Producer queue is full");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				Random random = new Random();
				int i = random.nextInt();
				queue.add(i);
				queue.notifyAll();
			}
		}
		
	}

}
