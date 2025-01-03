/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 3 Jan 2025 @ 9:48:29 am
 */

package javaIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class WriteUsingBufferedOutputStream {
	public static void main(String[] args) {
		String s = "This text is written using BufferedOutputStream";
		try(FileOutputStream fos = new FileOutputStream("bos.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			byte[] arr = s.getBytes();
			bos.write(arr);
			System.out.println("Data is written to the files.");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

