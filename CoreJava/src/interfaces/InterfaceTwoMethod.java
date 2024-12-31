/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 3:57:51 pm
 */

package interfaces;

interface interface7 {
	void methodOne();
	void methodTwo();
}

public class InterfaceTwoMethod implements interface7{
	@Override
	public void methodOne() {
		System.out.println("First Method");
	}
	public void methodTwo() {
		System.out.println("Second Method");
	}
	public static void main(String[] args) {
		InterfaceTwoMethod obj = new InterfaceTwoMethod();
		obj.methodOne();
		obj.methodOne();
	}
}

