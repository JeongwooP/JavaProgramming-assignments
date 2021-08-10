package ch07;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComboBox extends JFrame{
	private String[] value = {"0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100",
			"110", "120", "130", "140", "150", "160", "170", "180", 
			"190", "200", "210", "220", "230", "240",
			"250", "255"};
	private JComboBox<Integer> red, green, blue;
	private int e;
	private String c1,c2,c3;
	
	public ComboBox() {
		setSize(400, 450);
		setTitle("EX");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		red = new JComboBox(value);
		green = new JComboBox(value);
		blue = new JComboBox(value);
		
		JPanel panel = new JPanel();
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		add(panel, "North");
	
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		int re= (int)red.getSelectedItem();
		int ge= (int)green.getSelectedItem();
		int bl= (int)blue.getSelectedItem();
		
		g.setColor(new Color(re, ge, bl));
		g.fillOval(50, 80, 200, 200);
	}
	
	public class ComboListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			//c1 =((JComboBox)e.getSource());
			repaint();
		}
	}
	public static void main(String[] args) {

		(new ComboBox()).setVisible(true);
	}

}
