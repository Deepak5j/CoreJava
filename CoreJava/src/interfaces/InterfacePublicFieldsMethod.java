/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 3:42:20 pm
 */

package interfaces;

public interface InterfacePublicFieldsMethod {
	int num = 11;
	public void method();
}

class InterfacePublicFieldsMethodClass implements InterfacePublicFieldsMethod {
	@Override
	public void method() {
		System.out.println("This is method");
	}
	public static void main(String[] args) {
		InterfacePublicFieldsMethodClass obj = new InterfacePublicFieldsMethodClass();
		System.out.println(num);
		obj.method();
	}
}

