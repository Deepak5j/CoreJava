/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 10:42:25 am
 */

package loop;

public class PalindromeNumber {
	public static void main(String[] args) {
		long num;
		System.out.println("Enter a value: ");
		num = new java.util.Scanner(System.in).nextLong();
		if(pallindrome(num)) {
			System.out.println(num + " is a Palindrome Number");
		} else {
			System.out.println(num + " is not a Palidrome Number");
		}
	}
	
	static boolean pallindrome(long num) {
		long r, sum = 0, temp;
		temp = num;
		while(temp > 0) {
			r = temp % 10;
			sum = (sum * 10) + r;
			temp /= 10;
		}		
		return sum == num;
	}
}

