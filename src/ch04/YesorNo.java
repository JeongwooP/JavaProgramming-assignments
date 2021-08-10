package ch04;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class YesorNo extends JFrame{
	public YesorNo() {
		setSize(450, 150);
		setTitle("Yes/No");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		
		cPane.setLayout(new FlowLayout());
		JButton btnY = new JButton("Yes");
		JButton btnN = new JButton("No");
		cPane.setBackground(Color.GREEN);
		JLabel label = new JLabel("정보를 보내시겠습니까?");
		label.setFont(new Font("Serif", Font.BOLD, 30));
		label.setForeground(Color.blue);
		cPane.add(btnY);
		cPane.add(btnN);
		cPane.add(label);
	}
	
//	public void paint(Graphics g) {
////		Graphics2D g2 = (Graphics2D)g;
////	
////		g2.setColor(Color.blue);
////		g2.setFont(new Font("Serif", Font.BOLD, 18));
////		g2.drawString("정보를 보내시겠습니까?", 100, 100);
//	}
}
