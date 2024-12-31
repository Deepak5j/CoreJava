/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 4:02:06 pm
 */

package interfaces;

interface interface8 {
	void methodOne();
}

interface interface9 {
	void methodTwo();
}

public class TwoInterfaceOneMethod implements interface8, interface9{
	@Override
	public void methodOne() {
		System.out.println("This is Method one");
	}
	
	@Override
	public void methodTwo() {
		System.out.println("This is Method two");
	}
	public static void main(String[] args) {
		TwoInterfaceOneMethod obj = new TwoInterfaceOneMethod();
		obj.methodOne();
		obj.methodTwo();
	}
}

