/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 4:54:59 am
 */

package inheritance;

// super c;ass
public class A {
	int n = 11;
	void methodA1() {
		System.out.println("This is class A method 1");
	}
	void methodA2() {
		System.out.println("This is class A method 2");
	} 
	void method3() {
		System.out.println("This is override method - class A");
	}
}

// subclass of A
class B extends A {
	int n = 22;
	void methodB1() {
		System.out.println("This is class B method 1");
	}
	void methodB2() {
		System.out.println("This is class B method 2");
	}
	@Override
	void method3() {
		System.out.println("This is override method - class B");
	}
}

// subclass of B 
class C extends B {
	int n = 33;
	void methodC1() {
		System.out.println("This is class C method 1");
	}
	void methodC2() {
		System.out.println("This is class C method 2");
	}
	@Override
	void method3() {
		System.out.println("This is override method - class C");
	}
}

//working class
class Inheritence {
	public static void main(String[] args) {
		// For class A
		A a = new A();
		a.methodA1();
		a.methodA2();
		a.method3();
		
		// For class B
		B b = new B();
		b.methodB1();
		b.methodB2();
		b.method3();
		
		// For Class C
		C c = new C();
		c.methodC1();
		c.methodC2();
		c.method3();
		
		// for overridden method
		A orm;
		orm = new B(); // upcasting
		orm.method3();
		
		orm = new C(); // upcasting
		orm.method3();
		
		
		
		
		
		
		
	}
}
