/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 12:10:53 pm
 */

package exceptions;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		try {
			int[] a = new int[6];
			a[6] = 10 / 0;
			System.out.println(a[0]);
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch(Exception e) {
			System.out.println("Parent Exception occurs");
			e.getStackTrace();
			e.printStackTrace();
		}
	}

}

