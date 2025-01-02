/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 2:05:16 pm
 */

package exceptions;

public class NumberFormat {
	public static void main(String[] args) {
		String str = "123Deeapk";
		try {
			int x = Integer.parseInt(str);
			int y = Integer.parseInt(str);
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException caught!!");
			e.printStackTrace();
		}
	}

}

