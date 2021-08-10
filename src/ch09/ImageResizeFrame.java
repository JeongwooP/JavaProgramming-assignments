package ch09;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ImageResizeFrame extends JFrame implements ActionListener{
	private Image currImage;
	private int orgWidth, orgHeight, width, height;
	private JRadioButton btnSmall, btnMedium, btnFull;
	private int row, column;
	
	public ImageResizeFrame() {
		setSize(750, 900);
		setTitle("Demo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btnSmall = new JRadioButton("Small");
		btnMedium = new JRadioButton("Medium");
		btnFull = new JRadioButton("Full");
		btnSmall.addActionListener(this);
		btnMedium.addActionListener(this);
		btnFull.addActionListener(this);
		
		ButtonGroup group = new ButtonGroup();
		group.add(btnSmall);
		group.add(btnMedium);
		group.add(btnFull);
		
		setLayout(new FlowLayout());
		add(btnSmall);
		add(btnMedium);
		add(btnFull);
		
		currImage = (new ImageIcon("tiger.png")).getImage();
		orgWidth = width = currImage.getWidth(null);
		orgHeight = height = currImage.getHeight(null);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSmall) {
			width = orgWidth/3;
			height = orgHeight/3;
			row = 3;
			column = 3;
		}
		else if(e.getSource() == btnMedium) {
			width = orgWidth*2/3;
			height = orgHeight*2/3;
			row = 2;
			column = 2;
		}
		else if(e.getSource() == btnFull) {
			width = orgWidth;
			height = orgHeight;
			row = 1;
			column = 1;
		}
		repaint();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++)
				g.drawImage(currImage, 20+width*i, 80+height*j
						, width, height, null);
		}
	}
	
	public static void main(String[] args) {
		(new ImageResizeFrame()).setVisible(true);
	}

}
