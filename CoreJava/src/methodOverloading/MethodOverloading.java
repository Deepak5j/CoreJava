/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 1 Jan 2025 @ 9:28:57 am
 */

package methodOverloading;

public class MethodOverloading {
	int number1;
	int number2;
	int rollNo;
	String name;
	void method1(int number1) {
		this.number1 = number1;
		System.out.println("1. First number: " + number1);
	}
	void method1(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
		System.out.println("1.Sum of two number: " + (number1 + number2));
	}
	void method2(int rollNo) {
		this.rollNo = rollNo;
		System.out.println("2.Roll number: " + rollNo + "; " + "Name: " + name);		
	}
	void method2(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		System.out.println("2.Roll number: " + rollNo + "; " + "Name: " + name);
	}
	void method4(int rollNo) {
		this.rollNo = rollNo;
		System.out.println("4.Roll number: " + rollNo + "; " + "Name: " + name);
	}
	void method4(String name) {
		this.name = name;
		System.out.println("4.Name: " + name);
	}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.method1(11);
		obj.method1(10, 20);
		
		obj.method2(123);
		obj.method2(123, "Deepak");
		
		obj.method4(123);
		obj.method4("Deepak");		
	}
}

