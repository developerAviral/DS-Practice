package com.developer.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatingElements {
	
	public List<Character> getRepeatedElements(String s){
		char [] charArray = s.toLowerCase().toCharArray();
		Map <Character, Integer> charMap = new HashMap<>();
		
		for(char c : charArray) {
			Integer count = charMap.get(c);
			if(count != null) {
				charMap.put(c, ++count);
			}
			else {
				charMap.put(c,1);
			}
		}
		
		System.out.println(charMap);
		
		List<Character> repeatedElementList = new ArrayList<Character>();
		Set<Entry<Character, Integer>> charEntry = charMap.entrySet();
		
		for(Entry<Character, Integer> entry: charEntry) {
			if(entry.getValue() > 1){
				repeatedElementList.add(entry.getKey());
			}
		}
		return repeatedElementList;
	}

}
