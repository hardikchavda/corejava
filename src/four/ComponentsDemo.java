package four;

import java.awt.Button;
import java.awt.Frame;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class ComponentsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame f1 = new Frame();
		f1.setSize(300, 300);
		Button b1 = new Button("Click Me");
		Button b2 = new Button("Click Me Again");
		f1.add(b1);
		f1.add(b2);
		f1.setVisible(true);
	}

}
