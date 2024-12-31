/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 1 Jan 2025 @ 4:45:47 am
 */

package thisAndSuper;

class ParentClass {
	String name = "Deepak Gautam";
	ParentClass() {
		System.out.println("This is parent class constructor");
	}
}

class ChildClass extends ParentClass {
	String name = "Gautam";
	ChildClass() {
		super();
		System.out.println("This is child class cpnstructor");
	}
	void myMethod() {
		System.out.println("My name is " + super.name);
	}
}
public class CallUsingSuper {
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.myMethod();
	}

}

