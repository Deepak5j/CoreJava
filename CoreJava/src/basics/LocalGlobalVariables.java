/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 27 Dec 2024 @ 4:12:05 pm
 */

package basics;

public class LocalGlobalVariables {
	//global or class variable
	int globalVar = Integer.MAX_VALUE;
	void localVariable() {
		int localVar = Integer.MIN_VALUE;
		System.out.println("Local variable value = "+localVar);
	}
	
	public static void main(String[] args) {
		LocalGlobalVariables obj = new LocalGlobalVariables();
		//access global variable
		System.out.println("Global variable globalVar value = " + obj.globalVar);
		
		//access local variable
		obj.localVariable();
	}

}

