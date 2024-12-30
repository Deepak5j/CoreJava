/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 30 Dec 2024 @ 9:33:30 am
 */

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAtSpecificPosition {
	static int[] insertElement(int[] arr, int index, int v) {
		int[] arrNew = new int[arr.length+1];
		for(int i=arr.length; i>=index; i--) {
			arrNew[i] = arr[i-1];
		}
		arrNew[index] = v;
		for(int i=0; i<index; i++) {
			arrNew[i] = arr[i];
		}
		return arrNew;
	}
	public static void main(String[] args) {
		int index,  v;
		int[] arr = {11, 22, 33, 44, 66, 77, 88, 99};
		System.out.println("Array before insertion: " + Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index: ");
		index = sc.nextInt();
		System.out.printf("Enter value to inserted at index arr[%d]: ", index);
		v = sc.nextInt();
		arr = insertElement(arr, index, v);
		System.out.println("Array after insertion: ");
		System.out.println("arr = " + Arrays.toString(arr));
		
	}

}

