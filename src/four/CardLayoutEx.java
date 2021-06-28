package four;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;

/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
public class CardLayoutEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame frame = new Frame();

		Button b1 = new Button("First");
		Button b2 = new Button("Second");
		Button b3 = new Button("Third");
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);		

		// Card Layout Manager
		frame.setLayout(new CardLayout(100,100));

		frame.setSize(400, 400);

		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				frame.dispose();
			}
		});

	}

}
