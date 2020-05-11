package com.developer;

import com.developer.listds.LinkedList;
import com.developer.listds.List;

public class Test {

	public static void main(String[] args) {
		
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
		customList.remove(15);
		System.out.println("\n" +customList.size());
		customList.traverseList();
		
	}
}
