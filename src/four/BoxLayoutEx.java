package four;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class BoxLayoutEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame frame = new Frame();

		Button b1 = new Button("North");
		Button b2 = new Button("South");
		Button b3 = new Button("Center");
		Button b4 = new Button("East");
		Button b5 = new Button("West");

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);

		// Box Layout Manager
		frame.setLayout(new BoxLayout(frame, BoxLayout.X_AXIS));

		frame.setSize(400, 400);

		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				frame.dispose();
			}
		});
	}

}
