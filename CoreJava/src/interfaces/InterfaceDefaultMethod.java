/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 3:19:37 pm
 */

package interfaces;

interface Interface4 {
	default void defaultMethod() {
		System.out.println("This is a default method");
	}
}

public class InterfaceDefaultMethod implements Interface4 {
	public static void main(String[] args) {
		InterfaceDefaultMethod obj = new InterfaceDefaultMethod();
		obj.defaultMethod();
	}
}

