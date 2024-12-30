/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 30 Dec 2024 @ 3:24:29 pm
 */

package arrays;

import java.util.Arrays;

public class SecondLargestNumber {
	static int secondLargestNumber(int[] arr) {
		int tmp = -1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
		return arr[arr.length - 2];
	}
	public static void main(String[] args) {
		int[] arr = {11, 55, 22, 44, 33};
		System.out.println("arr[] =" + Arrays.toString(arr));
		System.out.println("Largest: " + secondLargestNumber(arr));
	}

}

