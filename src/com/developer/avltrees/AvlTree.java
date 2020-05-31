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
	
	private Node rightRotation(Node<T> node) {
		System.out.println("Rotating to right");
		
		Node tempLeftNode = node.getLeftChild();
		Node t = tempLeftNode.getRightChild();
		tempLeftNode.setRightChild(node);
		node.setLeftChild(t);
		
		node.setHeight(Math.max(height(node.getLeftChild()),height(node.getRightChild()) ) + 1);
		tempLeftNode.setHeight(Math.max(height(tempLeftNode.getLeftChild()), height(tempLeftNode.getRightChild())) + 1);
		
		return tempLeftNode;
	}
	
	private Node leftRotation(Node<T> node) {
		System.out.println("Rotating to left");
		
		Node tempRightNode = node.getRightChild();
		Node t = tempRightNode.getLeftChild();
		tempRightNode.setLeftChild(node);
		
		node.setRightChild(t);
		
		node.setHeight(Math.max(height(node.getLeftChild()),height(node.getRightChild()) ) + 1);
		tempRightNode.setHeight(Math.max(height(tempRightNode.getLeftChild()), height(tempRightNode.getRightChild())) + 1);
		
		return tempRightNode;
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
