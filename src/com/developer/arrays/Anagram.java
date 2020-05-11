package com.developer.arrays;

import java.util.Arrays;

public class Anagram {
	
	public void isAnagram(String[] str1, String[] str2) {
		
		if(str1.length != str2.length)
			System.out.println("String are not anagram.");
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0; i< str1.length; i++) {
			if(str1[i] != str2[i]) {
				System.out.println("Strings are not anagram");
				return;
			}
		}
		System.out.println("Strings are anagram;");
	}
}
