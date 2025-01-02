/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 2:08:08 pm
 */

package exceptions;

public class StringIndexOutOfBonds {
	public static void main(String[] args) {
		String str = "Deepak";
		try {
			char charAtNegativeIndex = str.charAt(-1);
			char charAtLengthIndex = str.charAt(11);
		} catch(StringIndexOutOfBoundsException e) {
			System.err.println("StringIndexOutOfBoundException caught!");
			e.printStackTrace();
		}
	}

}

