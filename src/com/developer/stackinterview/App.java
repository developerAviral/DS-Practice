package com.developer.stackinterview;

public class App {

	public static void main(String[] args) {
		MaxItemStack stack = new MaxItemStack();
		
		stack.push(11);
		stack.push(110);
		stack.push(91121);
		stack.push(201);
		stack.push(1919);
		

		System.out.println("Max Item: " + stack.getMax());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("Max Item after pop: " + stack.getMax());
		
		
	}

}
