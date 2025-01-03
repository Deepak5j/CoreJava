/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 3 Jan 2025 @ 9:11:39 am
 */

package javaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBufferedReader {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("src/textFilesForJavaIOPackage/bw.txt");
			BufferedReader br = new BufferedReader(fr)) {
			int data;
			while((data = br.read()) != -1) {
				System.out.print((char)data);
			}
		} catch(IOException e) {
			e.getStackTrace();
			e.printStackTrace();
		}
	}

}

