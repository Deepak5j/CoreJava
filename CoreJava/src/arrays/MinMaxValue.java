/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 30 Dec 2024 @ 11:19:47 am
 */

package arrays;

import java.util.Arrays;

public class MinMaxValue {
	static int minValue(int[] arr) {
		int min = arr[0];
		for(int i: arr) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}
	static int maxValue(int[] arr) {
		int max = arr[0];
		for(int i: arr) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55, 66};
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("Max value: " + maxValue(arr));
		System.out.println("Min value: " + minValue(arr));
		
	}

}

