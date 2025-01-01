/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 4:55:38 am
 */

package exceptions;

public class ClassNotFound {
	public static void main(String[] args) {
		try {
			Class.forName("Deepak");
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();			
		}
	}

}

