/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 5:06:02 am
 */

package exceptions;

import java.io.*;

public class FileNotFound {
	public static void main(String[] args) {
		try {
			BufferedReader reader= new BufferedReader(new FileReader(new File("/invalid/file/location")));
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

