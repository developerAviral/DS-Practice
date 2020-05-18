package com.developer.interview;

import java.util.Arrays;

public class Anagram {
	
	public Boolean isAnagram(String s1, String s2) {

		
		String input1 = (s1.replaceAll("\\s", "")).toLowerCase();
		String input2 = (s2.replaceAll("\\s", "")).toLowerCase();
		
		if(input1.length() != input2.length()) {
			return false;
		}
		
		char [] inpArr1 = input1.toCharArray();
		char [] inpArr2 = input2.toCharArray();
		
		Arrays.sort(inpArr1);
		Arrays.sort(inpArr2);
		
		if(Arrays.equals(inpArr1, inpArr2)) {
			return true;
		}
		return false;
	}

}
