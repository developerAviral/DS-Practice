package com.developer.binarysearchtrees;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;
	
	@Override
	public void insert(T data) {
		
		if(root == null) {
			this.root = new Node<T>(data);
		}
		else {
			insertNode(data, this.root);
		}
	}
	
	@Override
	public T getMaxValue() {
		if(this.root == null) return null;
		
		return getMax(this.root);
	}
	
	@Override
	public T getMinValue() {
		if(this.root == null) return null;
		
		return getMin(this.root);
	}
	
	@Override
	public void traverse() {

		if(this.root != null)
			inOrderTraversal(this.root);
		
	}

	
	public void insertNode(T data, Node<T> node) {
		
		if(data.compareTo(node.getData()) < 0) {
			if(node.getLeftNode() != null)
				insertNode(data, node.getLeftNode());
			else {
				node.setLeftNode(new Node<T>(data));
			}
		}
		else {
			if(node.getRightNode() != null ) {
				insertNode(data, node.getRightNode());
			}
			else {
				node.setRightNode(new Node<T>(data));
			}
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
			node.setLeftNode(delete(node.getLeftNode(), data));
		}
		else if(data.compareTo(node.getData())> 0) {
			node.setLeftNode(delete(node.getRightNode(), data));
		}
		else {
			if(node.getLeftNode() == null && node.getRightNode() == null) {
				System.out.println("Removing Leaf node");
				return null;
			}
			else if(node.getLeftNode() == null) {
				System.out.println("Removing right node");
				Node<T> temp = node.getRightNode();
				node = null;
				return temp;
			}
			else if(node.getRightNode() == null) {
				System.out.println("Removing left node");
				Node<T> temp = node.getLeftNode();
				node = null;
				return temp;
			}
			
			//this is the node with two children case
			System.out.println("Removing item with 2 child");
			Node<T> tempNode = getPredecessorNode(node.getLeftNode());
			node.setData(tempNode.getData());
			node.setLeftNode(delete(node.getLeftNode(), tempNode.getData()));
			return tempNode;
		}
		return node;
	}
	
	private Node<T> getPredecessorNode(Node<T> node){
		
		if(node.getRightNode() != null)
			return getPredecessorNode(node.getRightNode());
		return node;
	}

	
	private T getMax(Node<T> node) {
		if(node.getRightNode()!=null)
			return getMax(node.getRightNode());
		
		return node.getData();
	}

	
	private T getMin(Node<T> node) {
		if(node.getLeftNode()!=null)
			return getMin(node.getLeftNode());
		
		return node.getData();
	}

	private void inOrderTraversal(Node<T> node) {
		
		if(node.getLeftNode() != null)
			inOrderTraversal(node.getLeftNode());
		
		System.out.print(node.getData() + "--->");
		
		if(node.getRightNode() != null)
			inOrderTraversal(node.getRightNode());
	}
}
