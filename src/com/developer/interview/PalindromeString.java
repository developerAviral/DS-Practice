package com.developer.interview;

public class PalindromeString {

	public Boolean isPalindrom(String s) {
		char [] stringArr = s.toCharArray();
		
		int length = stringArr.length;
		int i = 0;
		int j = length -1;
		
		while(i<j) {
			if(stringArr[i] != stringArr[j])
				return false;
			
			i++;
			j--;
		}
		return true;
		
	}
}
