/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 1 Jan 2025 @ 4:53:33 am
 */

package thisAndSuper;

public class CallUsingThis {
	int number;
	String name;
	CallUsingThis() {
		this(11, "Deepak");
	}
	CallUsingThis(int number, String name) {
		this.number = number;
		this.name = name;
		System.out.println(number + " " + name);
	}
	public static void main(String[] args) {
		CallUsingThis obj1 = new CallUsingThis();
		CallUsingThis obj2 = new CallUsingThis(12, "Gautam");
	}

}

