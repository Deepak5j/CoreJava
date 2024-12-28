/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 8:58:50 am
 */

package operators;

public class LogicalOperator {
	public static void main(String[] args) {
		int a = 15;
		int b = 10;
		int c = 5;
		
		//Logacl AND &&
		System.out.println(a > b && a > c);
		System.out.println(a < b && a < c);
		System.out.println(a > b && a < c);
		
		//Logical OR ||
		System.out.println(a > b || a > c);
		System.out.println(a < b || a < c);
		System.out.println(a < b || a > c);
		
		//Logical NOT !
		System.out.println(!(a > b));
		System.out.println(!(a < b));	
		
	}

}

