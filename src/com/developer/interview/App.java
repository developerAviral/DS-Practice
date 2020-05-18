package com.developer.interview;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		
		/******Singleton Class**********/
		SingletonClass singleton = SingletonClass.getInstance();
		singleton.printHello();
		
		/**************Mutable class******************/
		HashMap map = new HashMap();
		map.put("1", "Hello");
		map.put("2", "Bufallo");
		MutableClass mutable = new MutableClass(0, map);
		
		HashMap returnMap = mutable.getMap();
		returnMap.put("1", "yo yo");
		
		
		System.out.println(map);
		System.out.println(mutable.getMap());
		System.out.println(returnMap);
		
		/********************Palindrome String****************/
		
		PalindromeString palindromeString = new PalindromeString();
		System.out.println(palindromeString.isPalindrom("Hello"));
		System.out.println(palindromeString.isPalindrom("ollo"));
		
		/*********************String Reversal*****************/
		ReverseString reverse = new ReverseString();
		System.out.println(reverse.getReverseString("Hello"));
		System.out.println(reverse.getReverseString("Hllo"));
		
		
		/*************************Anagram*********************/
		Anagram anagram = new Anagram();
		System.out.println(anagram.isAnagram("LISTEN","SILENt"));
		System.out.println(anagram.isAnagram("TRIANGLE","integral"));
		System.out.println(anagram.isAnagram("Mother In Law","Hitler Woman"));
		System.out.println(anagram.isAnagram("keep","seek "));
		
		
		/************************Repeating elements in Array****************/
		
		
	}
}
