package com.developer.interview;

import java.util.Arrays;

public class Anagram {
	
	public Boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		String input1 = (s1.replace("\\s", "")).toLowerCase();
		String input2 = (s2.replace("\\s", "")).toLowerCase();
		
		char [] inpArr1 = input1.toCharArray();
		char [] inpArr2 = input2.toCharArray();
		
		Arrays.sort(inpArr1);
		Arrays.sort(inpArr2);
		
		if((new String(inpArr1)).equals(new String(inpArr2))) {
			return true;
		}
		return false;
	}

}
