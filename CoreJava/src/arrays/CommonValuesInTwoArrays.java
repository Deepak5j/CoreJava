/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 5:56:49 pm
 */

package arrays;

//import java.lang.reflect.Array;
// DON"T write Array. Write Arrays. Line 28
import java.util.Arrays;

public class CommonValuesInTwoArrays {
	static void commonValues(int[] arr1, int[] arr2) {
		for(int k: arr1) {
			for(int i: arr2) {
				if(k == i) {
					System.out.println("Common values: " + k);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {11, 22, 33, 44, 55};
		int[] arr2 = {66, 77, 88, 55, 11};
		
		System.out.println("arr1[] = " + Arrays.toString(arr1));
		System.out.println("arr2[] = " + Arrays.toString(arr2));
		
		commonValues(arr1, arr2);
	}


}
	
	

