/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 27 Dec 2024 @ 1:14:11 pm
 */

package basics;

public class CallingFunction {
	public static void main(String[] arg) {
		//calling static method using class name
		CallingFunction.methodOne();
		
		//calling static method directly
		methodOne();
	}
	
	static void methodOne() {
		System.out.println("My name is Deepak Gautam.");
	}
}

