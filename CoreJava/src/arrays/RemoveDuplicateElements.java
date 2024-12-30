/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 30 Dec 2024 @ 1:59:55 pm
 */

package arrays;

import java.util.Arrays;

public class RemoveDuplicateElements {
	static int removeDuplicateElements(int[] arr, int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		for(int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}
	public static void main(String[] args) {
		int[] arr = {11, 22, 22, 33, 44, 55, 66};
		System.out.println("arr[] = " + Arrays.toString(arr));
		int n = arr.length;
		n = removeDuplicateElements(arr, n);
		System.out.println("Array after removing duplicate value: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	} 

}

