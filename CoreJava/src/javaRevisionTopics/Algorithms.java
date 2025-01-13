/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 14 Jan 2025 @ 4:45:12 am
 */

package javaRevisionTopics;

import java.util.Arrays;

public class Algorithms {
	//Sorting - bubble sort
	void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	//Sorting - selection sort
	void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int mainIndex = i;
			for(int j=i + 1; j<arr.length; j++) {
				if(arr[j] < arr[mainIndex]) {
					mainIndex = j;
				}
			}
			int temp = arr[mainIndex];
			arr[mainIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	//sorting - insertion sort
	void insertionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println(Arrays.toString(arr));
	}
	// Searching - binary
	void binarySearch(int[] arr, int target) {
		int low = 0, high = arr.length-1;
		while(low <= high) {
			int mid = low + (high-low) / 2;
			if(arr[mid] == target) System.out.println(target + " found at index " + mid);
			if(arr[mid] < target) low = mid + 1;
			else high = mid - 1;
		}
	}
	public static void main(String[] args) {
		Algorithms obj = new Algorithms();
		int[] array = {1, 5, 2, 4, 3};
		obj.bubbleSort(array);
		obj.selectionSort(array);
		obj.insertionSort(array);
		obj.binarySearch(array, 5);
		
		
	}
}

