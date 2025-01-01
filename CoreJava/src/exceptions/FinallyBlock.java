/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 5:13:09 am
 */

package exceptions;

import java.util.Scanner;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter divisor: ");
			int divisor = sc.nextInt();
			int data = 10 / divisor;
			System.out.printf("10/%d = %d",divisor, data);
			
		} catch(ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nFinally block is always excuted");
		}
	}

}

