/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 30 Dec 2024 @ 3:04:55 pm
 */

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
	static int[] removeElementFromArray(int[] arr, int index) {
		if(arr == null || index < 0 || index >= arr.length) {
			return arr;
		}
		int[] arrNew = new int[arr.length -1];
		for(int i = 0, k = 0; i < arr.length; i++) {
			if(i == index) {
				continue;
			}
			arrNew[k++] = arr[i];
		}
		return arrNew;
	}
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55};
		System.out.println("Select an index to remove a value from  " + Arrays.toString(arr) + ": ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		System.out.println("Array after removing element at index " + index);
		arr = removeElementFromArray(arr, index);
		System.out.println("arr = " + Arrays.toString(arr));
	}

}

