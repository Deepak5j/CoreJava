/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 9:55:40 am
 */

package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GenerateIOException {
	public static void main(String[] args) {
		File file = new File("text.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			fis.read();
			fis.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

