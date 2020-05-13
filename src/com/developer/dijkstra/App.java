package com.developer.dijkstra;

public class App {
	public static void main(String[] args) {
		Algorithm algo = new Algorithm();
		algo.interpretExpression("( ( 2 + 2 ) * ( 2 + 3 ) )");
		algo.printResult();
	}
}
