/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 3:29:15 pm
 */

package interfaces;

interface Interface5 {
	void oneMethod();
}

public class InterfaceOneMethod implements Interface5 {
	@Override
	public void oneMethod() {
		System.out.println("This is a method");
	}
	public static void main(String[] args) {
		InterfaceOneMethod obj = new InterfaceOneMethod();
		obj.oneMethod();
	}

}

