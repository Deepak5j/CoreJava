/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 30 Dec 2024 @ 10:06:54 am
 */

package arrays;

import java.util.Arrays;

public class MaxMinDifference {
	static void maxMinDifference(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int diff = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			} 
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		diff = max - min;
		System.out.printf("Maximum value: %d, Minimum value: %d", max, min);
		System.out.printf("\nDifference of largest and smallest value: %d", diff);
	}
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55};
		System.out.println("arr[] = " + Arrays.toString(arr));
		maxMinDifference(arr);
	}

}

