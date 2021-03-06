package com.developer.binarysearchtrees;

public class App {

	public static void main(String[] args) {
		Tree<Integer> tree = new BinarySearchTree<>();
		
		tree.insert(32);
		tree.insert(2);
		tree.insert(564);
		tree.insert(46);
		tree.insert(9352);
		tree.insert(-24);
		tree.insert(-3);
		tree.insert(453);
		
		System.out.println(tree.getKSmallest(tree.getRoot(), 5));
	}
}
