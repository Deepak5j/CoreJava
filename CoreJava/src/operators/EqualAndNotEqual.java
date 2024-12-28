/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 7:51:16 am
 */

package operators;

import java.util.Scanner;

public class EqualAndNotEqual {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter second number");
		int b = sc.nextInt();
		
		if (a == b) {
			System.out.println("Both numbers are equal");
		}
		
		if ( a != b) {
			System.out.println("Both are numbers different");
		}
	}

}

