package com.developer.interview.producerconsumer.withblockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	BlockingQueue<Integer> queue;
	
	
	public Consumer(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}


	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
				System.out.println(queue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
