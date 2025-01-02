/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 5:19:59 am
 */

package exceptions;

public class GenerateArithmeticException {
	public static void main(String[] args) {
		int a = 10, b = 0, c;
		try {
			c = a / b;
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException caught!");
			e.printStackTrace();
		}
	}

}

