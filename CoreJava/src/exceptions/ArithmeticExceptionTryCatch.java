/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 4:44:40 am
 */

package exceptions;

public class ArithmeticExceptionTryCatch {
	public static void main(String[] args) {
		int a = 10, b = 0, c;
		try {
			System.out.println("Inside try block");
			c = a / b;
			System.out.println("c = " + c); 
		}
		catch(ArithmeticException e) {
			System.out.println("Handling the Arithmetic expetion using try-catch block");
		}
		c = a / b;
		System.out.println("Without exception handling");
	}

}

