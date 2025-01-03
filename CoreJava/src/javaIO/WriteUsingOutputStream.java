/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 3 Jan 2025 @ 11:57:57 am
 */

package javaIO;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteUsingOutputStream {
	public static void main(String[] args) {
		String data = "This text is written using OutputStream.";
		String path = "src/textFilesForJavaIOPackage/os.txt";
		try(OutputStream fos = new FileOutputStream(path)) {
			byte[] db = data.getBytes();
			fos.write(db);
			System.out.println("Data is writen to the file.");
		} catch(Exception e) {
		e.printStackTrace();
		}
	}

}

