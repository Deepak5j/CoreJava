/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 3 Jan 2025 @ 12:16:39 pm
 */

package javaIO;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadUsingInputStream {
	public static void main(String[] args) {
		String path = "src/textFilesForJavaIOPackage/os.txt";
		try(InputStream fis = new FileInputStream(path)) {
			int i;
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

