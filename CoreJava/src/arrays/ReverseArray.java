/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 30 Dec 2024 @ 3:14:21 pm
 */

package arrays;

import java.util.Arrays;

public class ReverseArray {
	static int[] reverseArray(int[] arr) {
		int[] arrReverse = new int[arr.length];
		for(int i = arr.length-1; i >= 0; i--) {
			arrReverse[arr.length-1-i] = arr[i];			
		}
		return arrReverse;
	}
	
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55};
		System.out.println("Array before reverse: " + Arrays.toString(arr));
		arr = reverseArray(arr);
		System.out.println("Array after reverse: " + Arrays.toString(arr));
	}

}
