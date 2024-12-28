/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 10:33:10 am
 */

package loop;

import java.util.Scanner;

public class MaleFemaleSwitch {
	public static void main(String[] args) {
		System.out.println("Enter a character (M/F) : ");
		Scanner sc = new Scanner(System.in);
		char Gender = sc.next().charAt(0);
		switch(Gender) {
		case 'M':
			System.out.println("Gender is Male");
			break;
		case 'm':
			System.out.println("Gender is Male");
			break;
		case 'F':
			System.out.println("Gender is Female");
			break;
		case 'f':
			System.out.println("Gender is Female");
			break;
		}
	}

}

