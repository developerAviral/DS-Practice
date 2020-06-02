package com.developer.avltrees;

public class AvlTree<T extends Comparable<T>> implements Tree<T>{

	private Node<T> root;
	
	@Override
	public void insert(T data) {
		
		this.root = insert(this.root, data);
	}
	
	private Node<T> insert(Node<T> node, T data){
		if(node == null) return new Node<T>(data);
		
		if(data.compareTo(node.getData()) < 0) {
			node.setLeftChild(insert(node.getLeftChild(), data));
		}
		else {
			node.setRightChild(insert(node.getRightChild(), data));
		}
		
		node.setHeight(Math.max( height(node.getLeftChild()), height(node.getRightChild())) + 1);
		
		node = settleViolation(data, node);
		
		return node;
		
	}
	
	
	
	private Node<T> settleViolation(T data, Node<T> node) {
		int balance = getBalance(node);
		
		//Case I : left-left
		if(balance > 1 && data.compareTo(node.getLeftChild().getData()) < 0) {
			return rightRotation(node);
		}
		
		//Case II : right-right
		if(balance < -1 && data.compareTo(node.getRightChild().getData()) > 0) {
			return leftRotation(node);
		}
		
		//Case III : left right situation
		if(balance > 1 && data.compareTo(node.getLeftChild().getData())> 0) {
			node.setLeftChild(leftRotation(node.getLeftChild()));
			return rightRotation(node);
		}
		
		//Case IV : right left situation
		if(balance < -1 && data.compareTo(node.getRightChild().getData()) < 0) {
			node.setRightChild(rightRotation(node.getRightChild()));
			return leftRotation(node);
		}
		
		return node;
	}

	private int height(Node<T> node) {
		if(node == null) return -1;
		
		return node.getHeight();
	}
	
	private int getBalance(Node<T> node) {
		if(node == null) return 0;
		
		return height(node.getLeftChild()) - height(node.getRightChild());
	}
	
	private Node<T> rightRotation(Node<T> node) {
		System.out.println("Rotating to right");
		
		Node<T> tempLeftNode = node.getLeftChild();
		Node<T> t = tempLeftNode.getRightChild();
		tempLeftNode.setRightChild(node);
		node.setLeftChild(t);
		
		node.setHeight(Math.max(height(node.getLeftChild()),height(node.getRightChild()) ) + 1);
		tempLeftNode.setHeight(Math.max(height(tempLeftNode.getLeftChild()), height(tempLeftNode.getRightChild())) + 1);
		
		return tempLeftNode;
	}
	
	private Node<T> leftRotation(Node<T> node) {
		System.out.println("Rotating to left");
		
		Node<T> tempRightNode = node.getRightChild();
		Node<T> t = tempRightNode.getLeftChild();
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
