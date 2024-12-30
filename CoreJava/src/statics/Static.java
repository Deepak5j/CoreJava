/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 30 Dec 2024 @ 3:37:34 pm
 */

package statics;

public class Static {
	//1 Static variable (class variable) and
	static int sv1 = 11;
	static int sv2 = 22;
	
	//Non-static variable (Instance variable)
	int iv1 = 33;
	int iv2 = 44;
	
	//2 static method
	static void staticMethod1() {
		Static obj = new Static();
		//access instance variable obj is required
		System.out.println("Instance varibale: " + obj.iv1 + ", " + obj.iv2);
	}
	
	//3 instance method prints static variables in instance method 2
	void instanceMethod1() {
		//static variable direct access
		System.out.println("Static variables: " + sv1 + ", " + sv2);
	}
	//4 staticMethod2 call instance method1 in static method 2
	static void staticMethod2() {
		Static obj = new Static();
		obj.instanceMethod1();
	}
	//5 instanceMethod2() call static method in instanceMethod2
	void instanceMethod2() {
		staticMethod1();
	}
	public static void main(String[] args) {
		Static obj = new Static();
		System.out.println("Static variable: " + sv1 + ", " + sv2);
		System.out.println("Instance variables: " + obj.iv1 + ", " + obj.iv2);
		
		staticMethod1();
		staticMethod2();
		
		obj.instanceMethod1();
		obj.instanceMethod2();
	}
	
	

}

