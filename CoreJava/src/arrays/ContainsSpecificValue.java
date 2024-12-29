/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 29 Dec 2024 @ 3:43:54 pm
 */

package arrays;

import java.util.Arrays;

public class ContainsSpecificValue {
	static boolean contains(int[] arr, int n) {
		for(int i: arr) {
			if(n == i) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55};
		System.out.println("Enter value to be searched: ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = contains(arr, n);
		if(flag) {
			System.out.println("Contains: " + n + " in the array");
			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("Does not contains" + n + " in the array");
			System.out.println(Arrays.toString(arr));
		}
		sc.close();
	}
		

}

