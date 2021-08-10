package ch07;

import java.awt.Graphics;

import javax.swing.JFrame;

public class ShapeFrameTest extends JFrame{
	private MyShape[] shapes;
	
	public ShapeFrameTest() {
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		shapes = new MyShape[3];
		shapes[0] = new MyRect(50, 50, 200, 150);
		shapes[1] = new MyCircle(200, 180, 100);
		shapes[2] = new MyDiamond(220, 170, 300, 160);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		for (MyShape shape : shapes)
			shape.draw(g);
	}
	
	public static void main(String[] args) {
		(new ShapeFrameTest()).setVisible(true);
	}

}
