package com.developer.dijkstra;

import java.util.Stack;

public class Algorithm {

	private Stack<String> operationStack;
	private Stack<Double> valueStack;
	
	public Algorithm() {
		operationStack = new Stack<>();
		valueStack = new Stack<>();		
	}
	
	public void interpretExpression(String expression) {
		String[] expressionArray = expression.split(" ");
		
		for(String s : expressionArray) {
			if(s.equals("(")) {
				//do nothing
			}
			else if(s.equals("+")) {
				operationStack.push("+");
			}
			else if(s.equals("*")) {
				operationStack.push("*");
			}
			else if(s.equals(")")) {
				String operation = this.operationStack.pop();
				if(operation.equals("+")) {
					this.valueStack.push(this.valueStack.pop() + this.valueStack.pop());
				}
				else if(operation.equals("*")) {
					this.valueStack.push(this.valueStack.pop() * this.valueStack.pop());
				}
			}
			else {
				this.valueStack.push(Double.parseDouble(s));
			}
		}
	}
	
	public void printResult() {
		System.out.println(this.valueStack.pop());
	}
}
