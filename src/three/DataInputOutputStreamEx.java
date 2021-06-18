package three;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class DataInputOutputStreamEx {

	/**
	 * @param Main
	 *            Method
	 */
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("Data4.txt");
			DataOutputStream dataWrite = new DataOutputStream(fos);
			
			dataWrite.writeBytes(new String("Welcome to DataOutPutStream\n"));
			dataWrite.writeChars("This is new String.\n");
			dataWrite.writeBoolean(true);
			dataWrite.writeFloat(15.65f);
			System.out.println("Data has been created successfully.");

			FileInputStream fis = new FileInputStream("Data4.txt");
			DataInputStream dataRead = new DataInputStream(fis);
			int count = fis.available();
			byte[] getData = new byte[count];
			dataRead.read(getData);
			for (byte dt : getData) {
				System.out.print((char) dt);			
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
