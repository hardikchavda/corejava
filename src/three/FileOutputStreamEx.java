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
		// Streams =(BYTES)= File Handling
		// OUTPUT = FileOutPutStream
		// INPUT
		// We Write Here
		FileOutputStream fos = null;
		String s = "Welcome to Streams";		
		byte b[] = s.getBytes();
		try {
			fos = new FileOutputStream("Data.txt");
			fos.write(b); //A
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
