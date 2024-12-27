/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 27 Dec 2024 @ 3:37:44 pm
 */

package basics;

import java.nio.ByteBuffer;

public class DataTypes {
	public static void main(String[] args) {
		char c = (char)65; 
		boolean bo = true;
		byte b = Byte.MAX_VALUE; //value 128 will give error. range -128 to 127
		short s = Short.MAX_VALUE; // Range: -32,768 to 32,767 
		int i = Integer.MAX_VALUE; //Range: -2^31 to 2^31 - 1 (i.e., -2,147,483,648 to 2,147,483,647)
		long l = Long.MAX_VALUE; //Range: -2^63 to 2^63 - 1 (i.e., -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
		float f = Float.MAX_VALUE; //Range: Approximately ±3.40282347E+38F (with 7 digits of precision)
		double d = Double.MAX_VALUE; //Range: Approximately ±1.7976931348623157E+308 (with 15 digits of precision)
		
		System.out.println("char vriable c = " + c);
		System.out.println("boolean vriable bo = " + bo);
		System.out.println("byte vriable b = " + b);
		System.out.println("short vriable s = " + s);
		System.out.println("int vriable i = " + i);
		System.out.println("long vriable l = " + l);
		System.out.println("float vriable f = " + f);
		System.out.println("double vriable d = " + d);
		
	}
	

}

