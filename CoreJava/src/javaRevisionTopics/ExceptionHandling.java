/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 16 Jan 2025 @ 4:56:58 am
 */

package javaRevisionTopics;

public class ExceptionHandling {
	public static void main(String[] args) throws CustomException {
		try {
			int result = 10 / 0;
		} catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero: " + e.getMessage());
		} finally {
			System.out.println("Cleanup code.");
		}
		throw new CustomException("This is a custom exception.");
	}

}

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}
