package com.developer.avltrees;

public interface Tree<T extends Comparable<T>> {

	public void insert(T data);
	public void traverse();
}
