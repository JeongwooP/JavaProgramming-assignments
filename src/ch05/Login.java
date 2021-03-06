package ch05;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame{

	public Login() {
		setSize(300, 250);
		setTitle("login");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 2, 5, 5));
		panel.add(new JLabel("아이디", JLabel.RIGHT));
		panel.add(new JTextField());
		panel.add(new JLabel("비밀번호", JLabel.RIGHT));
		panel.add(new JTextField());
		panel.add(new JLabel());
		panel.add(new JCheckBox("아이디 저장"));
		panel.add(new JButton("로그인"));
		panel.add(new JButton("취소"));
		
		cPane.add(panel, BorderLayout.CENTER );
		
	}
	
	public static void main(String[] args) {
		(new Login()).setVisible(true);

	}

}
