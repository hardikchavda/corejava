package four;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class FirstApplet extends Applet {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {

		this.setSize(500, 500);
		// Text
		g.drawString("This is Text", 10, 10);
		// Line
		g.drawString("Line", 10, 20);
		g.drawLine(10, 21, 100, 21);
		// Rectangle
		g.drawString("Rect", 10, 35);
		g.drawRect(10, 37, 90, 90);
		// Filled Rectangle
		g.setColor(Color.CYAN);
		g.fillRect(10, 130, 91, 91);
		
		g.setColor(Color.GREEN);
		g.fillOval(120, 130, 91, 91);
		
			
		g.setColor(Color.ORANGE);
		g.fillArc(120, 225, 91, 91, 30, 270);
		
		g.setColor(Color.BLACK);
		g.fillOval(160, 240, 10, 10);
		
		
	}

}
