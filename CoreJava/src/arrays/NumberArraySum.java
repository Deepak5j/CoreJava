/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 1:19:46 pm
 */

package arrays;

public class NumberArraySum {
	static int numberArraySum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i: arr) {
			System.out.print(i + " + ");
		}
		System.out.println("- + - > " + numberArraySum(arr));
	}
}

