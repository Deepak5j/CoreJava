/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 30 Dec 2024 @ 9:27:59 am
 */

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {
	static void findIndex(int[] arr, int n) {
		for(int i=0; i<arr.length; i++) {
			if(n == arr[i]) {
				System.out.println(n + " is at index " + i);
			}
		}
	}
	public static void main(String[] args) {
		int index;
		int[] arr = {11, 22, 33, 44, 55, 66, 77};
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("Enter value to find its index: ");
		Scanner sc = new Scanner(System.in);
		index = sc.nextInt();
		findIndex(arr, index);
	}

}

