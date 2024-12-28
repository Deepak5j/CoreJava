/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 8:50:57 am
 */

package operators;

public class LargerSmallerNumber {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		int min = (a<b) ? a:b;
		int max = (a>b) ? a:b;
		
		System.out.println("Smaller Number in (5, 10) is " + min);
		System.out.println("Larger Number in (5, 10) is " + max);
		
		if(a > b) {
			System.out.println("Larger Number in (5, 10) is " + a);
		} else {
			System.out.println("Smaller Numebr in (5, 10) is " + a);
		}
		
		if(b > a) {
			System.out.println("Larger Number in (5, 10) is " + b);
		} else {
			System.out.println("Smaller Number in (5, 10) is " + b);
		}
	}
	

}

