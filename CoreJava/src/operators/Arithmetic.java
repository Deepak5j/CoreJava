/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 5:01:23 am
 */

package operators;

public class Arithmetic {
	static void add(int a, int b) {
		int sum = a+b;
		System.out.println("Addition of a + b = " + sum);
	}
	static void sub(int a, int b) {
		int sub = a - b;
		System.out.println("Subtraction of a - b = " + sub);
	}
	static void mult(int a, int b) {
		int mul = a * b;
		System.out.println("Multiplication of a * b = " + mul);
	}
	static void dive(int a, int b) {
		int div = a / b;
		System.out.println("Division of a / b = " + div);
	}
	public static void main(String[] args) {
		int a = 200;
		int b = 100;
		
		add(a, b);
		sub(a, b);
		mult(a, b);
		dive(a, b);
	}

}

