package four;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box.Filler;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class GridBagLayoutEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame frame = new Frame();

		Button b1 = new Button("First");
		Button b2 = new Button("Second");
		Button b3 = new Button("Third");
		Button b4 = new Button("Fourth");
		Button b5 = new Button("Fifth");

		// Grid Bag Layout Manager
		frame.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		c.gridx = 0;		
		c.gridy = 0;
		c.ipadx = 20;
		c.ipady = 20;		
		c.weighty = 50;
		c.weightx = 50;
		frame.add(b1, c);

		c.gridx = 1;		
		c.gridy = 1;			
		frame.add(b3, c);

		c.gridx = 1;
		c.gridy = 2;
		frame.add(b2, c);

		c.gridx = 3;
		c.gridy = 0;
		frame.add(b4, c);

		c.gridx = 4;
		c.gridy = 0;
		frame.add(b5, c);

		frame.setSize(400, 400);

		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				frame.dispose();
			}
		});

	}

}
