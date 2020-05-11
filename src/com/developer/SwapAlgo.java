package com.developer;

import java.util.Arrays;

public class SwapAlgo {

	public void printReversedArray(int [] arr) {
		int startIndex = 0;
		int endIndex = arr.length - 1;
		
		while(endIndex > startIndex) {
			swap(arr, startIndex, endIndex);
			startIndex++;
			endIndex--;
		}
		
		
		//  Arrays.stream(arr).parallel().forEach(e -> System.out.println(e + " "));
		 
		
		
		  for(int i=0; i< arr.length; i++) System.out.println(arr[i]);
		 
	}
	
	public void swap(int[] nums, int index1, int index2) {
		int temp = nums[index2];
		nums[index2] = nums[index1];
		nums[index1] = temp;
	}
}
