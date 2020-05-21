package com.developer.binarysearchtrees;

public interface Tree<T extends Comparable<T>> {
	public void traverse();
	public void insert(T data);
	//public void delete();
	public T getMaxValue();
	public T getMinValue();
	public void delete(T data);
}
