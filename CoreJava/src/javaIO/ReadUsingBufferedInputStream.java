/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 2 Jan 2025 @ 2:12:46 pm
 */

package javaIO;

import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class ReadUsingBufferedInputStream {
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("src/textFIlesForJavaIOPackage/bos.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i;
			while((i = bis.read()) != -1) {
				System.out.print((char)i);
			}
			bis.close();
			fis.close();
			
		} catch(Exception e) {
			e.getStackTrace();
			e.printStackTrace();
		}
	}

}

