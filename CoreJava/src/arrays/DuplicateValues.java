/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 29 Dec 2024 @ 5:24:54 pm
 */

package arrays;

import java.util.Arrays;

public class DuplicateValues {
	static void duplicateValues(int[] arr) {
		System.out.println("Duplicate values: ");
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if((arr[i] == arr[j] && (i != j))) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55, 22, 44, 33, 44, 22};
		System.out.println("arr[] = " + Arrays.toString(arr));
		duplicateValues(arr);
	}

}

