/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 12:09:05 pm
 */

package exceptions;

public class MethodThrowsException {
	static void throwException() {
		throw new RuntimeException("Throwing exception");
	}
	public static void main(String[] args) {
		throwException();
	}

}

