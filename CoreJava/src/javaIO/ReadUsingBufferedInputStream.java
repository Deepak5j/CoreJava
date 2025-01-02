/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 2:12:46 pm
 */

package javaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;

public class ReadUsingBufferedInputStream {
	public static void main(String[] args) {
		String filePath = "src/textFilesForJavaIOPackage/bos.txt";
		try(FileInputStream fis = new FileInputStream(filePath);
			BufferedInputStream bis = new BufferedInputStream(fis)) {
			int data;
			while((data = bis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch(IOException e) {
			e.getStackTrace();
			e.printStackTrace();			
		}
	}

}

