/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 3:35:01 pm
 */

package interfaces;

interface Interface6 {
	int number0 = 00; //default
	public int number1 = 11;
	static final int number2 = 22;
	final int number3 = 33;
	//private int number4 = 44; //private is Illegal access modifier
	//protected int number5 = 55; //protected is Illegal access modifier
}
public class InterfacePrivateProtected implements Interface6{
	public static void main(String[] args) {
		InterfacePrivateProtected obj = new InterfacePrivateProtected();
		System.out.println("default field value: " + number0);
		System.out.println("public field value: " + number1);
		System.out.println("static final default field value: " + number2);
		System.out.println("final default field value: " + number3);
		
	}

}

