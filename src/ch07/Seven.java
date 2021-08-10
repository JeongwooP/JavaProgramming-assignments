package ch07;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Seven extends JFrame{
	
	private JTextField inputName;
	private JRadioButton r1, r2;
	private JButton btn;
	
	public Seven() {
		setTitle("관심 분야 등록");
		//setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		

		BtnListener listener = new BtnListener();
		
		JLabel label1 = new JLabel("이름과 전공을 선택하시오.");
		label1.setFont(new Font("SansSerif", Font.BOLD, 20));
		label1.setForeground(Color.BLUE);
		
		JLabel labelN = new JLabel("이름");
		inputName = new JTextField(8);
		JLabel label2 = new JLabel("전공: ");
		r1 = new JRadioButton("소프트웨어");
		r2 = new JRadioButton("가상현실");
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		
		panel1.add(label1);
		panel2.add(labelN);
		panel2.add(inputName);
		panel3.add(label2);
		panel3.add(r1);
		panel3.add(r2);


		
		add(panel1);
		add(panel2);
		add(panel3);
		pack();

	}
	
	public class BtnListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn) {
				String name = inputName.getText();
				String major = "none";
				if(r1.isSelected()) 
					major = r1.getText();
				else if(r2.isSelected())
					major = r2.getText();
				(new SevenResultFrame(name, major)).setVisible(true);
			}
		}
	}
	
	public static void main(String[] args) {
		(new Seven()).setVisible(true);

	}

}
