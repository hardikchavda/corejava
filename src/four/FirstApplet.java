package four;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
public class FirstApplet extends Applet{
	
	/* (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		g.drawString("Hello Applet", 10, 10);	
	}

}
