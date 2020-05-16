package com.developer.binarysearchtrees;

public interface Tree<T extends Comparable<T>> {
	public void traverse();
	public void insertNode(T data, Node<T> node);
	public void delete();
	public T getMax();
	public T getMin();
}
