/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 3 Jan 2025 @ 12:03:31 pm
 */

package javaIO;

import java.io.FileOutputStream;
import java.util.Properties;

public class WriteUsingPropertiesFile {
	public static void main(String[] args) {
		Properties props = new Properties();
		props.put("Name", "Deepak Gautam");
		props.put("E.no", "1312210037");
		props.put("College", "SRMGPC");
		String data = "This is a sample properties ffile";
		String path = "src/textFilesForJavaIOPackage/pf.txt";
		try(FileOutputStream os = new FileOutputStream(path)) {
			props.store(os, data);
			System.out.println("Properties file created");			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

