package ch08;

import java.awt.Graphics;

public class MyShape implements Drawable{
	protected int x,y;
	public MyShape(int x, int y) {
		this.x = x; this.y = y;
	}
	public void draw(Graphics g) {};
}
