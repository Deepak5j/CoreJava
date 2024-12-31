/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 11:54:42 am
 */

package accessmodifiers;
//public class must be one only in a java file
//public class name must be same as the file name

class DefaultClass {
	int myAge;
	String myName;
	void defaultMethof() {
		System.out.println("My name is " + myName + " and my age is " + myAge);
	}
}

class OtherDeailClassFieldsMethod {
	public static void main(String[] args) {
		DefaultClass obj = new DefaultClass();
		obj.myAge = 21;
		obj.myName = "Deepak";
		obj.defaultMethof();
	}	
}

