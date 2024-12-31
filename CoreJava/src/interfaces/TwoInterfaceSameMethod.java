/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 4:06:18 pm
 */

package interfaces;

interface interface10 {
	void sameMethod();
}

interface interface11 {
	void sameMethod();
}

public class TwoInterfaceSameMethod implements interface10, interface11{
	@Override
	public void sameMethod() {
		System.out.println("This is same method in both the interfaces");
	}
	public static void main(String[] args) {
		TwoInterfaceSameMethod obj = new TwoInterfaceSameMethod();
		obj.sameMethod();
	}
}

