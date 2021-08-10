package report5;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Computer extends JFrame{
	private int price = 0;
	private JCheckBox c1, c2, c3, c4, c5;
	private JLabel label;
	
	
	public Computer() {
		setSize(250, 350);
		setTitle("Order...");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cPane = getContentPane();
		ChListner listener = new ChListner();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 2));
		c1 = new JCheckBox("CPU");
		c2 = new JCheckBox("메인보드");
		c3 = new JCheckBox("HDD");
		c4 = new JCheckBox("RAM");
		c5 = new JCheckBox("모니터");
		c1.addItemListener(listener);
		c2.addItemListener(listener);
		c3.addItemListener(listener);
		c4.addItemListener(listener);
		c5.addItemListener(listener);
		panel.add(c1);
		panel.add(new JLabel("220000원"));
		panel.add(c2);
		panel.add(new JLabel("180000원"));
		panel.add(c3);
		panel.add(new JLabel("80000원"));
		panel.add(c4);
		panel.add(new JLabel("60000원"));
		panel.add(c5);
		panel.add(new JLabel("160000원"));
		cPane.add(panel, BorderLayout.CENTER);
		label = new JLabel("합계 = " + price + "원");
		label.setFont(new Font("Serif", Font.BOLD, 30));
		cPane.add(label, BorderLayout.SOUTH);
		
	}
	
	private class ChListner implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == c1)
					price += 220000;
				else if(e.getItem() == c2)
					price += 180000;
				else if(e.getItem() == c3)
					price += 80000;
				else if(e.getItem() == c4)
					price += 60000;
				else if(e.getItem() == c5)
					price += 160000;
			}
			else {
				if(e.getItem() == c1)
					price -= 220000;
				else if(e.getItem() == c2)
					price -= 180000;
				else if(e.getItem() == c3)
					price -= 80000;
				else if(e.getItem() == c4)
					price -= 60000;
				else if(e.getItem() == c5)
					price -= 160000;
			}
				
			label.setText("합계= " + price + "원");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Computer()).setVisible(true);
	}

}
