package ch08;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame{
	JTextField field;
	int num2;
	String fNum = "", operator = "";
	
	public CalculatorFrame() {
		setSize(300, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cPane = getContentPane();
		
		field = new JTextField("0");
		field.setHorizontalAlignment(JTextField.RIGHT);
		field.setEditable(false);
		
		cPane.add(field, BorderLayout.PAGE_START);
		
		BtnListener btn = new BtnListener();
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0 , 4));
		JButton n7= new JButton("7");
		JButton n8= new JButton("8");
		JButton n9= new JButton("9");
		JButton n0= new JButton("0");
		JButton n4= new JButton("4");
		JButton n5= new JButton("5");
		JButton n6= new JButton("6");
		JButton c= new JButton("C");
		JButton n1= new JButton("1");
		JButton n2= new JButton("2");
		JButton n3= new JButton("3");
		JButton e= new JButton("=");
		JButton a = new JButton("+");
		JButton s = new JButton("-");
		JButton m = new JButton("*");
		JButton d = new JButton("/");
		
		n7.addActionListener(btn);
		n8.addActionListener(btn);
		n9.addActionListener(btn);
		n0.addActionListener(btn);
		n4.addActionListener(btn);
		n5.addActionListener(btn);
		n6.addActionListener(btn);
		c.addActionListener(btn);
		n1.addActionListener(btn);
		n2.addActionListener(btn);
		n3.addActionListener(btn);
		e.addActionListener(btn);
		a.addActionListener(btn);
		s.addActionListener(btn);
		m.addActionListener(btn);
		d.addActionListener(btn);
		panel.add(n7);
		panel.add(n8);
		panel.add(n9);
		panel.add(n0);
		panel.add(n4);
		panel.add(n5);
		panel.add(n6);
		panel.add(c);
		panel.add(n1);
		panel.add(n2);
		panel.add(n3);
		panel.add(e);
		panel.add(a);
		panel.add(s);
		panel.add(m);
		panel.add(d);
		
		cPane.add(panel, BorderLayout.CENTER);
		
	}
	
	public class BtnListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String num1 = ((JButton)e.getSource()).getText();
			int  num3, num4 = 0;
			
	
			if(num1 == "+") {
				num2 = Integer.parseInt(fNum);
				operator = "+";
				fNum = "";
				field.setText(fNum);
			}
			else if(num1 == "-") {
				num2 = Integer.parseInt(fNum);
				operator = "-";
				fNum = "";
				field.setText(fNum);
			}
			else if(num1 == "*") {
				num2 = Integer.parseInt(fNum);
				operator = "*";
				fNum = "";
				field.setText(fNum);
			}
			else if(num1 == "/") {
				num2 = Integer.parseInt(fNum);
				operator = "/";
				fNum = "";
				field.setText(fNum);
			}
			else if(num1 == "=") {
				num3 = Integer.parseInt(fNum);
				if(operator == "+")
					num4 = num2 + num3;
				else if(operator == "-")
					num4 = num2 - num3;
				else if(operator == "*")
					num4 = num2 * num3;
				else if(operator == "/")
					num4 = num2 / num3;
				field.setText(Integer.toString(num4));
			}
			else if(num1 == "C") {
				fNum = "";
				field.setText(fNum);
			}
			else {
				fNum += num1;
				field.setText(fNum);
			}
		}

	}
	
	public static void main(String[] args) {
		(new CalculatorFrame()).setVisible(true);
	}

}
