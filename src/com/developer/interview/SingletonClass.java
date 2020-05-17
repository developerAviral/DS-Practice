package com.developer.interview;

public class SingletonClass {

	private static volatile SingletonClass INSTANCE;
	
	private SingletonClass() {}
	
	public static SingletonClass getInstance() {
		if(INSTANCE == null)
		{
			synchronized (SingletonClass.class) {
				if(INSTANCE == null) {
					INSTANCE = new SingletonClass();
				}
			}
		}
		return INSTANCE;
	}
	
	public void printHello() {
		System.out.println("Hi Aviral!!");
	}
}
