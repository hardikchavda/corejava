package three;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class FileInputStreamEx {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("Data.txt");
			int read = 0;
			while ((read = fis.read()) != -1) {
				System.out.print((char) read);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
