package com.developer.avltrees;

public class App {
	
	public static void main(String[] args) {
		AvlTree<Integer> avlTree = new AvlTree<>();
		
		avlTree.insert(10);
		avlTree.insert(20);
		avlTree.insert(40);
		avlTree.insert(50);
		avlTree.insert(60);
		avlTree.insert(70);
		
		avlTree.traverse();
	}

}
