package report2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Angular extends JFrame{
	private static final int XINIT = 250;
	private static final int YINIT = 250;
	private static final int K = 20;
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		int x = 1, y = 1, count = 0;
		int xOld = XINIT, yOld = YINIT, xNew = XINIT, yNew = YINIT;
		for(int i=0; i< 40; i++) {
			if(count % 4 == 0) {
				xNew = xOld + K * x;
				x++;
			}
			else if(count % 4 == 2) {
				xNew = xOld - K * x;
				x++;
			}
			if(count % 4 == 1) {
				yNew = yOld + K * y;
				y++;
			}
			else if(count % 4 == 3) {
				yNew = yOld - K * y;
				y++;
			}
			
			g.drawLine(xOld, yOld, xNew, yNew);
			xOld = xNew;
			yOld = yNew;
		
			count++;
		}
	}
}
