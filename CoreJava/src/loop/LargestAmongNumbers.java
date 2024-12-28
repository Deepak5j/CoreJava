/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 10:22:21 am
 */

package loop;

import java.util.Scanner;

public class LargestAmongNumbers {
	public static void main(String[] args) {
		int a, b, c;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = num.nextInt();
		System.out.println("Enter Second Number: ");
		b = num.nextInt();
		System.out.println("Enter Third Number");
		c = num.nextInt();
		
		if((a > b) && (a > c)) {
			System.out.println("The Largest Number is : " + a);
		} 
		else if((b > a) && (b > c)) {
			System.out.println("The Largest Number is : " + b);
		}
		else {
			System.out.println("The Largest Number is : " + c);
		}
		
		
	}

}

