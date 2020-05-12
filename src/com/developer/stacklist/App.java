package com.developer.stacklist;

public class App {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(11);
		stack.push(110);
		stack.push(201);
		stack.push(1919);
		stack.push(91121);
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		System.out.println("Size:" + stack.size());
		System.out.println("Is empty:" + stack.isEmpty());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("Size:" + stack.size());
		System.out.println("Is empty:" + stack.isEmpty());
		System.out.println(stack.pop());
	}
}
