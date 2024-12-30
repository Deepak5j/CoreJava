/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 30 Dec 2024 @ 9:22:45 am
 */

package arrays;

import java.util.Arrays;

public class EvenOddNumbers {
	static void evenNumber(int[] arr) {
		System.out.println("Even numbers in array:-");
		for(int i: arr) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	static void oddNumber(int[] arr) {
		System.out.println("\nOdd numbers in array:-");
		for(int i: arr) {
			if(i%2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55, 66};
		System.out.println("a[] = " + Arrays.toString(arr));
		evenNumber(arr);
		oddNumber(arr);
	}

}

