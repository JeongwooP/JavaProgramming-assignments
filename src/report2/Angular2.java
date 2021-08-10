package report2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Angular2 extends JFrame{
	private static final int XINIT = 250;
	private static final int YINIT = 250;
	private static final int L = 20;
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		int x = 1, y = 1, count = 1;
		int xOld = XINIT, yOld = YINIT, xNew = XINIT, yNew = YINIT;
		for(int i=1; i<= 40; i++) {
			if(count % 4 == 1) {
				xNew = xOld + L * x;
				x = x+1;
			}
			else if(count % 4 == 3) {
				xNew = xOld - L * x;
				x = x+1;
			}
			if(count % 4 == 2) {
				yNew = yOld + L * y;
				y = y+1;
			}
			else if(count % 4 == 0) {
				yNew = yOld - L * y;
				y = y+1;
			}
			
			g.drawLine(xOld, yOld, xNew, yNew);
			xOld = xNew;
			yOld = yNew;
		
			count = count + 1;
		}
	}
}
