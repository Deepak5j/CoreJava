/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 2:54:10 pm
 */

package accessmodifiers;

public class PublicClassFieldsMethods {
	public static void main(String[] args) {
		PublicClass obj = new PublicClass();
		obj.name = "Public field";
		obj.publicMethod();
	}
}

class PublicClass {
	public String name = "Public";
	public void publicMethod() {
		System.out.println("This is " + name);
	}
}

