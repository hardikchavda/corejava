package three;

import java.io.*;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class StreamWriterReaderEx {

	/**
	 * @param OutputStreamWriter
	 *            & InputStreamReader
	 */
	public static void main(String[] args) {
		// Java supports UTF Encoding
		try {

			OutputStream writefile = new FileOutputStream("Data5.txt");
			Writer dataWrite = new OutputStreamWriter(writefile);
			dataWrite.write("Hello this is my UTF encoded data.");
			// This data will be written encoded in UTF.
			dataWrite.close();

			FileInputStream readfile = new FileInputStream("Data5.txt");
			// Reader dataReader = new InputStreamReader(readfile);
			// int data = dataReader.read();
			// while (data != -1) {
			// System.out.print((char) data);
			// data = dataReader.read();
			// }
			InputStreamReader ins = new InputStreamReader(readfile);
			String str = ins.getEncoding();
			System.out.println("Windows Encoding:" + str);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
