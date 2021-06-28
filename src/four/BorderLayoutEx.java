package four;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class BorderLayoutEx {

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

		//Border Layout Manager
		frame.add(b1, BorderLayout.NORTH);
		frame.add(b2, BorderLayout.SOUTH);
		frame.add(b3, BorderLayout.CENTER);
		frame.add(b4, BorderLayout.EAST);
		frame.add(b5, BorderLayout.WEST);

		frame.setSize(400, 400);

		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				frame.dispose();
				//System.exit(0);
			}
		});

	}

}
