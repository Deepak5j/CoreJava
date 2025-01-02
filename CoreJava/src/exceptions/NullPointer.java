/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 2:02:25 pm
 */

package exceptions;

public class NullPointer {
	static void simpleNullCheck(String str) {
		System.out.println(str.length());
	}
	public static void main(String[] args) {
		String input = null;
		try {
			simpleNullCheck(input);
		} catch(NullPointerException e) {
			System.out.println("NullPointerException caught!");
			e.printStackTrace();
		}
	}

}

