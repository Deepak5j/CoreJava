/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 4:49:39 am
 */

package exceptions;

public class ArrayIndexOutOfBound {
	public static void main(String[] args) {
		String[] arr = {"Deepak", "Gautam", "Rahul"};
		try {
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}

