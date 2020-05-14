package com.developer.stackinterview;

public class App {

	public static void main(String[] args) {

		QueueUsingStack stack = new QueueUsingStack();

		stack.enqueue((11));
		stack.enqueue(110);
		stack.enqueue(91121);
		stack.enqueue(201);
		stack.enqueue(1919);

		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());

	}

}
