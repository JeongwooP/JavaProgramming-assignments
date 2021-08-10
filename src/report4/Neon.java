package report4;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Neon extends JFrame{
	private int count = 0;
	
	public Neon() {
		setSize(650, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		JButton button = new JButton("빨간색으로");
		button.addActionListener(new BtnListener());
		cPane.add(button);
	}
	
	public void paint(Graphics g) {
		int[] xPoints1 = {150, 250, 280, 250, 150, 180};
		int[] yPoints1 = {150, 150, 200, 250, 250, 200};
		
		int[] xPoints2 = {260, 360, 390, 360, 260, 290};
		int[] yPoints2 = {150, 150, 200, 250, 250, 200};
		
		int[] xPoints3 = {370, 470, 500, 470, 370, 400};
		int[] yPoints3 = {150, 150, 200, 250, 250, 200};
		if(count == 1) 
			g.setColor(Color.red);
		else if(count == 2) 
			g.setColor(Color.blue);
		else if(count == 3)
			g.setColor(Color.yellow);
		else
			g.setColor(Color.gray);
		g.fillPolygon(xPoints1, yPoints1, xPoints1.length);
		g.fillPolygon(xPoints2, yPoints2, xPoints1.length);
		g.fillPolygon(xPoints3, yPoints3, xPoints1.length);
			
	}
	private class BtnListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String s;
			count++;
			if(count == 1) 
				s = "파란색으로";
			else if(count == 2) 
				s = "노란색으로";
			else if(count == 3) 
				s = "회색으로";
			else {
				count %= 4;
				s = "빨간색으로";
			}
			JButton btn = (JButton) e.getSource();
			btn.setText(s);
			repaint();
		}
	}

}
