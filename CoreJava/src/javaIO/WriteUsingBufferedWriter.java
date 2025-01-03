/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 3 Jan 2025 @ 9:53:51 am
 */

package javaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteUsingBufferedWriter {
	public static void main(String[] args) {
		String data = "This text is written using BufferedWritter.555s";
		try(FileWriter fw = new FileWriter("src/textFilesForJavaIOPackage/br.txt");
			BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write(data);
			System.out.println("Data is written to the file.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

