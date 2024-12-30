/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 30 Dec 2024 @ 11:27:02 am
 */

package arrays;

import java.util.Arrays;

public class MissingNumbers {
	static void missingNumber(int[] arr) {
		Arrays.sort(arr);
		System.out.println("a[] = " + Arrays.toString(arr));
		int j = 0;
		for(int i=1; i<100; i++) {
			if(j < arr.length && i == arr[j]) {
				j++;
			}
			else {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {10, 20 ,30, 40, 50, 60, 70, 80, 90};
		missingNumber(arr);
	}

}

