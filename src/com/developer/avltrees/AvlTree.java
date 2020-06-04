package com.developer.avltrees;

import com.developer.avltrees.Node;

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

	@Override
	public void delete(T data) {
		if(this.root != null)
		{
			delete(this.root, data);
		}		
	}
	
	private Node<T> delete(Node<T> node, T data){
		if(node == null)
			return node;
		else if(data.compareTo(node.getData()) < 0) {
			node.setLeftChild(delete(node.getLeftChild(), data));
		}
		else if(data.compareTo(node.getData())> 0) {
			node.setLeftChild(delete(node.getRightChild(), data));
		}
		else {
			if(node.getLeftChild() == null && node.getRightChild() == null) {
				System.out.println("Removing Leaf node");
				return null;
			}
			else if(node.getLeftChild() == null) {
				System.out.println("Removing right node");
				Node<T> temp = node.getRightChild();
				node = null;
				return temp;
			}
			else if(node.getRightChild() == null) {
				System.out.println("Removing left node");
				Node<T> temp = node.getLeftChild();
				node = null;
				return temp;
			}
			
			//this is the node with two children case
			System.out.println("Removing item with 2 child");
			Node<T> tempNode = getPredecessorNode(node.getLeftChild());
			node.setData(tempNode.getData());
			node.setLeftChild(delete(node.getLeftChild(), tempNode.getData()));
		
		} 	
		
		node.setHeight(Math.max(height(node.getLeftChild()), height(node.getRightChild()))+1);
		return settleDeletion(node);
	}
	
	private Node<T> getPredecessorNode(Node<T> node){
		
		if(node.getRightChild() != null)
			return getPredecessorNode(node.getRightChild());
		return node;
	}
	
	private Node<T> settleDeletion(Node<T> node){
		int balance = getBalance(node);
		
		if(balance > 1) {
			if(getBalance(node.getLeftChild())< 0) {
				node.setLeftChild(leftRotation(node.getLeftChild()));
			}
			return rightRotation(node);
		}
		
		if(balance < -1) {
			if(getBalance(node.getRightChild())> 0) {
				node.setRightChild(rightRotation(node.getRightChild()));
			}
			return leftRotation(node);
		}
		
		return node;
		
	}

}
