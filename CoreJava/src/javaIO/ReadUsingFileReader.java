/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 3 Jan 2025 @ 9:28:22 am
 */

package javaIO;

import java.io.FileReader;
import java.io.IOException;

public class ReadUsingFileReader {
	try(FileReader fr = new FileReader("fw.txt")) {
		int data;
		while((data = fr.read()) != -1) {
			System.out.print((char)data);
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
  }
}

