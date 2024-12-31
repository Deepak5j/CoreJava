/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 1 Jan 2025 @ 5:01:30 am
 */

package thisAndSuper;

class Parent {
	void method1() {
		System.out.println("Using this() and super() in method");
	}
	void method2() {
		this.method1();
	}
}
class Child extends Parent{
	void method3() {
		super.method2();
	}
}
public class ThisSuperInMethods {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.method3();
	}
}

