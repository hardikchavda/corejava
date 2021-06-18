package three;

import java.io.IOException;
import java.io.InputStream;
import java.io.StreamTokenizer;
import java.io.StringReader;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class StreamTokenizerEx {
	
	/**
	 * @param Main
	 *            Method
	 *             
	 */
	public static void main(String[] args) {
		
		StringReader s = new StringReader("Hello i Have 1 pen.");
		StreamTokenizer st = null;
		st= new StreamTokenizer(s);
		try {
			while (st.nextToken() != StreamTokenizer.TT_EOF) {
				if (st.ttype == StreamTokenizer.TT_WORD) {
					System.out.println("Word: " + st.sval);
					
				} else if (st.ttype == StreamTokenizer.TT_NUMBER) {
					System.out.println("Val: " + st.nval);
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
