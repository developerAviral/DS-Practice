package com.developer.interview.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class App {

	public static void main(String[] args) {
		Queue<Integer> buffer = new LinkedList<>();
		int maxSize = 10;
		
		Thread producer = new Producer(buffer, maxSize, "PRODUCER");
		Thread consumer = new Consumer(buffer, maxSize, "CONSUMER");
		
		producer.start();
		consumer.start();
	}
}
