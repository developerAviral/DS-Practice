package com.developer.binarysearchtrees;

public class TreeCompareHelper<T extends Comparable<T>> {

	public Boolean compareTrees(Node<T> node1, Node<T> node2) {
		// we have to check the base cases 
		if(node1==null || node2==null) return node1==node2;
		
		if(node1.getData().compareTo(node2.getData()) != 0) return false;
		
		return compareTrees(node1.getLeftNode(), node2.getLeftNode()) && compareTrees(node1.getRightNode(), node2.getRightNode());
	}
}
