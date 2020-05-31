package com.developer.avltrees;

public class AvlTree<T extends Comparable<T>> implements Tree<T>{

	private Node<T> root;
	
	@Override
	public void insert(T data) {
		
		
	}
	
	private int height(Node<T> node) {
		if(node == null) return -1;
		
		return node.getHeight();
	}
	
	private int getBalance(Node<T> node) {
		if(node == null) return 0;
		
		return height(node.getLeftChild()) - height(node.getRightChild());
	}

	@Override
	public void traverse() {
		
		
		if(this.root == null) return;
		
		inOrderTraversal(this.root);
		
	}
	
	private void inOrderTraversal(Node<T> node) {
		if(node.getLeftChild() != null) {
			inOrderTraversal(node.getLeftChild());
		}
		
		System.out.print(node);
		
		if(node.getRightChild() != null) {
			inOrderTraversal(node.getRightChild());
		}		
	}

}
