/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 3 Jan 2025 @ 10:02:42 am
 */

package javaIO;

import java.io.FileWriter;

public class WriteUsingFileWriter {
	public static void main(String[] args) {
		String data = "This text is written using FileWriter.";
		String path = "src/textFilesForJavaIOPackage/fw.txt";
		try(FileWriter fw = new FileWriter(path)) {
			fw.write(data);
			System.out.println("Data is written to the file.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

