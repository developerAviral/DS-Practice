package com.developer.binarysearchtrees;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;
	
	public void insert(T data) {
		
		if(root == null) {
			this.root = new Node<T>(data);
		}
		else {
			insertNode(data, this.root);
		}
	}
	
	@Override
	public void traverse() {
		// TODO Auto-generated method stub
		
	}

	@Override
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
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getMax() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getMin() {
		// TODO Auto-generated method stub
		return null;
	}

}
