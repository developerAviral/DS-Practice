package com.developer.interview;

public class ReverseString {

	public String getReverseString(String s) {
		//StringBuilder str = new StringBuilder(s);
		//System.out.println("reverse: " + str.reverse().toString());
		char[] stringArray = s.toCharArray();
		
		int i=0;
		int j = stringArray.length-1;
		
		while(i<j) {
			char temp = stringArray[i];
			stringArray[i] =  stringArray[j];
			stringArray[j] = temp;
			i++;
			j--;
		}
		
		return new String(stringArray);
	}
}
