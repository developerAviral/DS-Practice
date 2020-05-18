package com.developer.interview.producerconsumer.withblockingqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Integer> queue;
	
	
	
	public Producer(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}



	@Override
	public void run() {
		Random random = new Random();
		while(true) {
			int i = random.nextInt();
			try {
				
				queue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
