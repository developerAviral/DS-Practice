package com.developer.interview.producerconsumer.withblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
	
	public static void main(String[] args) {
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<>();
		
		Thread producer = new Thread(new Producer(sharedQueue));
		Thread consumer = new Thread(new Consumer(sharedQueue));
		
		producer.start();
		consumer.start();
	}
}
