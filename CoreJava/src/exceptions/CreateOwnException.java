/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 4:58:26 am
 */

package exceptions;

class InvalidExamException extends Exception {
	InvalidExamException(String msg) {
		System.out.println(msg);
	}
}
public class CreateOwnException {
	static void exam(int marks) throws InvalidExamException {
		if(marks < 40) {
			throw new InvalidExamException("Failed in exam");
		} else {
			System.out.println("Passed in exam");
		}
	}
	public static void main(String[] args) {
		try {
			exam(1);
			//exam(111);  NO EXCEPTION RAIS	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

