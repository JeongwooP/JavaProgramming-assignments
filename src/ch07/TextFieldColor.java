package ch07;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldColor extends JFrame{
	private JTextField red, green, blue;
	
	public TextFieldColor() {
		setSize(400, 450);
		setTitle("Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		red = new JTextField(4);
		green = new JTextField(4);
		blue = new JTextField(4);
		JButton button = new JButton("»Æ¿Œ");
		button.addActionListener(new ButtonListener());
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		cPane.add(new JLabel("Red"));
		cPane.add(red);
		cPane.add(new JLabel("Green"));
		cPane.add(green);
		cPane.add(new JLabel("Blue"));
		cPane.add(blue);
		cPane.add(button);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		int re = Integer.parseInt(red.getText());
		int gr = Integer.parseInt(green.getText());
		int bl = Integer.parseInt(blue.getText());
		g.setColor(new Color(re, gr, bl));
		g.fillOval(50, 80, 200, 200);
	}
	
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
	
	public static void main(String[] args) {
		(new TextFieldColor()).setVisible(true);
	}

}
