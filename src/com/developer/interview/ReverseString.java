package com.developer.interview;

public class ReverseString {

	public String getReverseString(String s) {
		StringBuilder str = new StringBuilder(s);
		//System.out.println("reverse: " + str.reverse().toString());
		return str.reverse().toString();
	}
}
