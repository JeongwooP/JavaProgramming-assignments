package ch07;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SevenResultFrame extends JFrame{

	public SevenResultFrame(String name, String major) {
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel rLabel = new JLabel(name + "���� ������ " + major + "�Դϴ�.");
		rLabel.setFont(new Font("SansSerif", Font.BOLD, 26));
		rLabel.setForeground(Color.red);
	}
}
