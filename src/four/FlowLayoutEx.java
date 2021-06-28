package four;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class FlowLayoutEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame();

		Button b1 = new Button("Add");
		Button b2 = new Button("Edit");
		Button b3 = new Button("Delete");
		Button b4 = new Button("Next");
		Button b5 = new Button("Previous");

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		
		
		//Flow Layout Manager
		frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

		frame.setSize(400, 400);

		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				frame.dispose();
			}
		}); 
		
	}

}
