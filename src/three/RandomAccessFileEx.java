package three;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class RandomAccessFileEx {

	/**
	 * @param Main
	 *            Method
	 */
	public static void main(String[] args) {		
		// seek()
		// Array of bytes

		try {
			RandomAccessFile writefile = new RandomAccessFile("Data1.txt", "rw");
			writefile.seek(0);
			writefile.write(new String("Hello").getBytes());
			writefile.close();
			System.out.println("Data1 named file has been created");

			RandomAccessFile readfile = new RandomAccessFile("Data1.txt", "r");
			readfile.seek(0);
			byte[] bytes = new byte[100];
			readfile.read(bytes);
			readfile.close();

			System.out.println(new String(bytes));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
