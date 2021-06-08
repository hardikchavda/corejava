package three;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
public class FileReaderWriterEx {

	/**
	 * @param Main Method
	 */
	public static void main(String[] args) {
	
		try {
			FileWriter fileWrite = new FileWriter("Data2.txt");
			fileWrite.write("Welcome to Character Reading Writing Class");
			fileWrite.close();
			
			FileReader fileRead = new FileReader("Data2.txt");
			int i=0;
			while ((i=fileRead.read())!=-1) {
				System.out.print((char)i);
			}			
			fileRead.close();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	
	}

}
