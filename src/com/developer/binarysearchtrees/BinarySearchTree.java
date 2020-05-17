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
	public void delete() {
		// TODO Auto-generated method stub
		
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
