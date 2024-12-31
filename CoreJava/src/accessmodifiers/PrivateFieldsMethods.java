/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 2:32:02 pm
 */

package accessmodifiers;

public class PrivateFieldsMethods {
	private String name = "Deepak Gautam";
	private int age = 31;
	
	private void privateMethod() {
		System.out.println("My name is " + name + " and my age is " + age);
	}
	
	public static void main(String[] args) {
		PrivateFieldsMethods obj = new PrivateFieldsMethods();
		System.out.println(obj.age);
		System.out.println(obj.name);
		obj.privateMethod();
	}

}

