/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 29 Dec 2024 @ 4:35:50 pm
 */

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
	static void copyingArray(int[] arr) {
		int[] copy = arr;
		System.out.println("Copied array =" +Arrays.toString(copy));
	}
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter size: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				System.out.printf("my_arr[%d] = ", i);
				arr[i] = sc.nextInt();
			}
			System.out.println("array = " + Arrays.toString(arr));
			copyingArray(arr);
		}
	}
}

