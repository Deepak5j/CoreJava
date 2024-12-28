/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 9:19:54 am
 */

package loop;

import java.util.Scanner;

public class ArmstrongNumber {
	static boolean isArmstrongNumber(int n) {
		int unitDigit = -1, result = 0;
		int temp = n;
		while(n != 0) {
			unitDigit = n % 10;
			result += unitDigit * unitDigit * unitDigit;
			n = n / 10;
		}
		return temp == result;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		
		if(isArmstrongNumber(num)) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");
		}
	}

}

