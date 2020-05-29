package com.developer;

import java.util.HashMap;
import java.util.HashSet;

import com.developer.listds.LinkedList;
import com.developer.listds.List;

 public class Test {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap<>();
		Object o1 = new Object();
		Object o2 = o1;
		hm.put(o1, 1);
		hm.put(o2, 3);
		
		System.out.println(hm.get(o1));
		
		/*Reverse of string*/
		/*
		 * SwapAlgo swapAlgo = new SwapAlgo();
		 * 
		 * int arr[]= new int [999];
		 * 
		 * for(int i=0; i<999;i++) arr[i] = i; swapAlgo.printReversedArray(arr);
		 */
		
		
		/***************************************************************************/
		
		/*Anagram */
		/*Anagram anagram = new Anagram();
		String arr1[]= new String [5];
		String arr2[]= new String [5];
		
		arr1[0] = "a";
		arr1[1] = "b";
		arr1[2] = "c";
		arr1[3] = "d";
		arr1[4] = "f";
		
		
		arr2[0] = "d";
		arr2[1] = "a";
		arr2[2] = "b";
		arr2[3] = "c";
		arr2[4] = "e";
		
		anagram.isAnagram(arr1, arr2);
		*/
		
		/********************************************************************************/
		/*Custom LinkedList */
		
		List<Integer> customList = new LinkedList<Integer>();
		customList.insert(10);
		customList.insert(20);
		customList.insert(15);
		customList.insert(1000);
		customList.traverseList();
		//customList.remove(15);
		//System.out.println("\n" +customList.size());
		customList.traverseList();
		
		System.out.print("Get Middle node: ");
		System.out.println(customList.getMiddleNode());
		customList.reverse();
		customList.traverseList();
		System.out.println();
		customList.reverse();
		System.out.println();
		customList.traverseList();
		
	}
}
