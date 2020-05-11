package com.developer.listds;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	private Node<T> root;
	private int sizeOfList = 0;
	
	@Override
	public void insert(T data) {
		++sizeOfList;
		Node<T> newNode = new Node<>(data);
		if(root == null) {
			root = newNode;
		}
		else {
			//insertDataAtBeginning(data);
			insertDataAtEnd(data, this.root);
		}
		
	}
	
	private void insertDataAtBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(this.root);
		this.root = newNode;
	}
	
	private void insertDataAtEnd(T data, Node<T> node) {
		
		if(node.getNextNode() != null)
			insertDataAtEnd(data, node.getNextNode());
		
		else {
		node.setNextNode(new Node<>(data));
		}
	}

	@Override
	public void remove(T data) {
		if(root == null)
			return;
		
		--sizeOfList;
		
		if(root.getData().compareTo(data) == 0){
			this.root =this.root.getNextNode();
		}
		else {
			remove(data, root, this.root.getNextNode());
		}
			
	}
	
	private void remove(T dataToRemove,Node<T> previousNode,Node<T> actualNode) {
		while(actualNode != null) {
			if(actualNode.getData().compareTo(dataToRemove) == 0) {
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public void traverseList() {
		if(root == null) return;
		
		Node<T> actualNode = this.root;
		
		while(actualNode != null) {
			System.out.print(actualNode+"->");
			actualNode = actualNode.getNextNode();
		}
		
	}

	@Override
	public int size() {
		return this.sizeOfList;
	}

}
