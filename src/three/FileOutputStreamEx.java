package three;

/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {

		// Java I/O API
		// Streams =(BYTES,CHAR)= File Handling
		// OUTPUT = FileOutPutStream
		// INPUT
		// We Write Here

		FileOutputStream fos = null;
		String s = "Welcome to Streams 2021.This is my first IO Data, for Streams";
		byte b[] = s.getBytes();
		try {
			fos = new FileOutputStream("Data.txt");
			fos.write(b);
			System.out.println("File has been created.");
			// We created a file and put the data into a file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
