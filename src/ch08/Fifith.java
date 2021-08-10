package ch08;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fifith extends JFrame{

	
	private class MyPanel extends JPanel{
		private Point[] points = new Point[20];
		private int count = 0;
		
		public MyPanel() {
			setBackground(Color.white);
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					if(count < points.length)
						points[count++] = new Point(e.getX(), e.getY());
						repaint();
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
	
			for(int i = 0 ; i < count; i++) {
				switch(i%3) {
				case 0:
					g.setColor(Color.red);
					break;
				case 1:
					g.setColor(Color.green);
					break;
				case 2:
					g.setColor(Color.blue);
					break;
				}
				g.fillRect(points[i].x, points[i].y, 30, 30);
			}
			
		}
	}
	
	public Fifith() {
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new MyPanel());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Fifith()).setVisible(true);
	}

}
