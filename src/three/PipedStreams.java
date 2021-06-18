package three;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class PipedStreams {

	/**
	 * @param Main
	 *            Method
	 */
	public static void main(String[] args) {
		PipedInputStream incoming = new PipedInputStream();
		PipedOutputStream outgoing = new PipedOutputStream();
		try {
			// Use of connect() : connecting incoming with outgoing
			incoming.connect(outgoing);

			// Use of read() method :
			outgoing.write(new String("H").getBytes()); 
			System.out.println(incoming.available()); 
			System.out.println("incoming Used : " + (char) incoming.read());
			System.out.println(incoming.available());

			outgoing.write(new String("Ok").getBytes()); 
			System.out.println(incoming.available()); 
			System.out.println("incoming Used : " + (char) incoming.read());
			System.out.println(incoming.available()); 

			outgoing.write(new String("S").getBytes()); 
			System.out.println(incoming.available());
			System.out.println("incoming Used : " + (char) incoming.read());
			System.out.println(incoming.available());
			
			incoming.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
