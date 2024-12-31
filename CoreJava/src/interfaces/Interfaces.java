/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 3:12:03 pm
 */

package interfaces;

interface Interface1 {
	void methodOne();
}

interface Interface2 extends Interface1{
	void methodTwo();
}

class Interfaces implements Interface2{
	@Override
	public void methodOne() {
		System.out.println("This is first method");
	}
	@Override
	public void methodTwo() {
		System.out.println("This is second method");
	}
	public static void main(String[] args) {
		Interfaces obj = new Interfaces();
		obj.methodOne();
		obj.methodTwo();
	}
		
}

