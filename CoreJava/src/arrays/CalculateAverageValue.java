/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 5:52:17 pm
 */

package arrays;

public class CalculateAverageValue {
	static void calculateAverageValue(int[] arr) {
		int sum = 0;
		for(int i: arr) {
			sum += i;
		}
		double avg = sum / arr.length;
		System.out.println("The average of array is " + avg);
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		calculateAverageValue(arr);
	}

}

