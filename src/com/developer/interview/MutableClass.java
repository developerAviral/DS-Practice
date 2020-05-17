package com.developer.interview;

import java.util.HashMap;

public class MutableClass {

	private int i;
	private HashMap<String,String> map;
	
	@SuppressWarnings("unchecked")
	public MutableClass(int i, HashMap<String, String> map) {
		this.i = i;
		this.map = (HashMap<String, String>) map.clone();
	}
	
	public int getI() {
		return i;
	}
	
	@SuppressWarnings("unchecked")
	public HashMap<String, String> getMap(){
		this.map.put("1","Bye Bye");
		return (HashMap<String, String>) this.map.clone();
	}
 	
}
