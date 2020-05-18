package com.developer.interview;

public class BinarySearchInArray<T extends Comparable<T>> {

	public void searchElement(T[] arr, T input) {
		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last) / 2;

		while (first <= last) {
			if (arr[mid].compareTo(input) < 0) {
				first = mid + 1;
			} else if (arr[mid].compareTo(input) ==0) {
				System.out.println("Element found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}

			mid = (first + last) / 2;
		}

		if (first > last) {
			System.out.println("Element is not found!");
		}

	}
	
	public int binarySearchWithRecursion(T[] arr, T input) {
		return binarySearch(arr, 0, arr.length-1, input);
	}
	
	private int binarySearch(T [] arr , int first, int last, T input) {
		if(last < first)
			return -1;
		
		int mid = (first + last)/2;
		
		if(arr[mid].compareTo(input) == 0)
			return mid;
		else if(arr[mid].compareTo(input) < 0)
			return binarySearch(arr, mid +1, last, input);
		else
			return binarySearch(arr, first, mid-1 , input);
	}
}
