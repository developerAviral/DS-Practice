package com.developer.binarysearchtrees;

public interface Tree<T> {
	public void traverse();
	public void insert(T data);
	public void delete();
	public T getMax();
	public T getMin();
}
