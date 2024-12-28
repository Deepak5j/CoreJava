/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 9:56:35 am
 */

package loop;

import java.util.Scanner;

public class EvenOrOddNumberSwitch {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number: ");
		n = new Scanner(System.in).nextInt();
		
		switch(n % 2) {
		case 0: System.out.println(n + " is an Evem number"); break;
		case 1: System.out.println(n + " is an Odd Number"); break;
		}
	}

}

