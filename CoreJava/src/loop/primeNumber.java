/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 28 Dec 2024 @ 10:57:28 am
 */

package loop;

public class primeNumber {
	static void isPrimeNumber(int n) {
		boolean isPrime = false;
		for(int i = 2; i <= n / 2; ++i) {
			if(n % i == 0 ) {
				isPrime = true;
				break;
			}
		}
		if(!isPrime) {
			System.out.println(n + " is a Prime Number");
		} else {
			System.out.println(n + " is not a Prime Number");
		}
	}
	
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number: ");
		num = new java.util.Scanner(System.in).nextInt();
		isPrimeNumber(num);
	}

}

