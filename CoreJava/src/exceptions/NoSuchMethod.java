/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 12:18:25 pm
 */

package exceptions; 

import java.lang.reflect.Method;

class ClassAddition {
	public void addition(int a, int b) {
		int c;
		c = a + b;
		System.out.println(c);
	}
}

public class NoSuchMethod {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("exceptions.ClassAddition");
			Method m = c.getDeclaredMethod("addition", int.class, int.class);
			Method m2 = c.getDeclaredMethod("subtraction", int.class, int.class);
			System.out.println(c);
			System.out.println(m);	
			System.out.println(m2);	

		} catch(NoSuchMethodException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

