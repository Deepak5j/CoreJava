/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 2:49:37 pm
 */

package accessmodifiers;

public class ProtectedClassFieldsMethod {
	protected String name;
	protected void protectedMethod() {
		System.out.println("This is a " + name);
	}
}

class protectedClass {
	public static void main(String[] args) {
		ProtectedClassFieldsMethod obj  = new ProtectedClassFieldsMethod();
		obj.name = "Protected method";
		obj.protectedMethod();
	}
}

