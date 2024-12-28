/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 9:46:45 am
 */

package loop;

import java.util.Scanner;

public class EvenAndOddNumbers {
	static void evenNumber(int n) {
		System.out.println("These are Even Numbers from 0 to " + n);
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
	}
	
	static void oddNumber(int n) {
		System.out.println("\n These are Odd Numbers from 1 to " + n);
		for(int i = 1; i <= n; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		num = sc.nextInt();
		evenNumber(num);
		oddNumber(num);
	}

}

