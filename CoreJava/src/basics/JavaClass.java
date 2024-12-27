/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 27 Dec 2024 @ 3:34:03 pm
 */

package basics;

public class JavaClass {
	String message = "Java Class";
	void isMethod() {
		System.out.println(message);
		System.out.println("Method running...");
	}
	public static void main(String[] args) {
		JavaClass obj = new JavaClass();
		obj.isMethod();
	}
}

