package report1_2;

import java.awt.Graphics;
import javax.swing.JFrame;

public class F extends JFrame{

	public void paint(Graphics g){
		g.drawOval(100,100,250,250);
		g.drawOval(125,125,200,200);
		g.drawOval(150,150,150,150);
		g.drawOval(175,175,100,100);
		g.fillOval(200,200,50,50);
		
	}
}

