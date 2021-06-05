package three;

import java.io.File;
import java.io.IOException;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class FileEx {

	/**
	 * @param Main
	 *            Method
	 */
	public static void main(String[] args) {
		// We use file class for getting file directories and file names.
		// Windows, Unix & Mac have their own dir structures
		File f1 = new File("Data.txt");
		if (f1.exists()) {
			try {
				System.out.println("FilePath: " + f1.getAbsolutePath());
				System.out.println("Read Permission: " + f1.canRead());
				System.out.println("Write Permission: " + f1.canWrite());
				System.out.println("FilePath: " + f1.getCanonicalPath());
				System.out.println("Free Space in Bytes: " + f1.getFreeSpace());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File does not exists.");
		}

	}

}
