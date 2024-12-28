/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 8:03:14 am
 */

package operators;

public class IncrementAndDecrement {
	static void preIncrement(int a, int b) {
		int d;
		d = b + (++a);
		System.out.println("Value after pre-increment a,b,d :" + a + ", " + b + "," + d);
	}
	static void postIncrement(int a, int b) {
		int d;
		d = b + (a++);
		System.out.println("Value after post-increment a,b,d: " + a + ", " + b + ", " + d);
	}
	static void preDecrement(int a, int b) {
		int d = b + (--a);
		System.out.println("Value after pre-decrement a,b,d: " + a + ", " + b + ", " + d);
		
	}
	static void postDecrement(int a, int b) {
		int d;
		d = b + (a--);
		System.out.println("Value after post-decrement a,b,d: " + a + ", " + b + ", " + d);
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		preIncrement(a, b);
		postIncrement(a, b);
		preDecrement(a, b);
		postDecrement(a, b);
	}
}

