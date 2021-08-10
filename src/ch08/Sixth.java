package ch08;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sixth extends JFrame{
	public static final int NUM = 20;
	private int x = 20, y = 20;
	
	private class MyPanel extends JPanel{
		public MyPanel() {
			setBackground(Color.white);
	
			this.setFocusable(true);
			this.requestFocus();
			
			
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					switch(e.getKeyCode()) {
					case KeyEvent.VK_UP:
						y -= NUM;
						break;
					case KeyEvent.VK_DOWN:
						y += NUM;
						break;
					case KeyEvent.VK_RIGHT:
						x += NUM;
						break;
					case KeyEvent.VK_LEFT:
						x -= NUM;
						break;
					}
					
					if(x >= 400)
						x = 400;
					
					if(y >= 400)
						y = 400;
						
					repaint();
					
				}
			});
		}	
		
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillRect(10, 20, x, y);
	  }
	} 

	
	public Sixth() {
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new MyPanel());
	}
	
	public static void main(String[] args) {
		(new Sixth()).setVisible(true);
	}

}
