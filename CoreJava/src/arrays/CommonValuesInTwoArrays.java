/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 5:56:49 pm
 */

package arrays;

import java.lang.reflect.Array;

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
		
		System.out.println("arr1[] = " + Array.tpString(arr1));
		
	}


}
	
	

