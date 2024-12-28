/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 10:39:37 am
 */

package loop;

public class MultipleIfElseStatement {
	public static void main(String[] args) {
		int a=10, b=20, c=30;
		if(a > b && a > c) {
			System.out.println(a + " is the Largest Number");
		}
		else if(b > a && b > c) {
			System.out.println(b + " is the Largest Number");
		}
		else {
			System.out.println(c + " is the Largest number");
		}
	}

}

