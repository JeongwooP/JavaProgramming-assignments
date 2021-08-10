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

public class Shop extends JFrame{
	private int i = 0;
	private JCheckBox a, b, c, d, e;
	private JLabel label;
	
	
	public Shop() {
		setSize(200, 300);
		setTitle("Ordering Computer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cPane = getContentPane();
		Check listener = new Check();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 2));
		a = new JCheckBox("CPU");
		b = new JCheckBox("메인보드");
		c = new JCheckBox("HDD");
		d = new JCheckBox("RAM");
		e = new JCheckBox("모니터");
		a.addItemListener(listener);
		b.addItemListener(listener);
		c.addItemListener(listener);
		d.addItemListener(listener);
		e.addItemListener(listener);
		panel.add(a);
		panel.add(new JLabel("220000원"));
		panel.add(b);
		panel.add(new JLabel("180000원"));
		panel.add(c);
		panel.add(new JLabel("80000원"));
		panel.add(d);
		panel.add(new JLabel("60000원"));
		panel.add(e);
		panel.add(new JLabel("160000원"));
		cPane.add(panel, BorderLayout.CENTER);
		label = new JLabel("합계 = " + i + "원");
		label.setFont(new Font("Serif", Font.BOLD, 30));
		cPane.add(label, BorderLayout.SOUTH);
	}
	
	private class Check implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == a)
					i += 220000;
				else if(e.getItem() == b)
					i += 180000;
				else if(e.getItem() == c)
					i += 80000;
				else if(e.getItem() == d)
					i += 60000;
				else if(e.getItem() == e)
					i += 160000;
			}
			else {
				if(e.getItem() == a)
					i -= 220000;
				else if(e.getItem() == b)
					i -= 180000;
				else if(e.getItem() == c)
					i -= 80000;
				else if(e.getItem() == d)
					i -= 60000;
				else if(e.getItem() == e)
					i -= 160000;
			}
			label.setText("합계= " + i + "원");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Shop()).setVisible(true);
	}
}
