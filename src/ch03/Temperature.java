package ch03;

import javax.swing.JOptionPane;

public class Temperature {

	public static void main(String[] args) {
		String tmp, message1 = "", message2 = "";
		char deter;
		double numB, numC = 0;
		tmp = JOptionPane.showInputDialog("��ȯ�� �µ� �Է�");
		deter = tmp.charAt(tmp.length()-1);
		numB = Double.parseDouble(tmp.substring(0, tmp.length()-1));
		switch(deter) {
		case 'F':
		case 'f':
			numC = (numB - 32) / 1.8;
			message1 = "ȭ��";
			message2 = "����";
			break;
		case 'C':
		case 'c':
			numC = numB * 1.8 + 32;
			message1 = "����";
			message2 = "ȭ��";
			break;
		}
		
		JOptionPane.showMessageDialog(null, message1 + numB + "���� "
				+ message2 + numC + "�� �Դϴ�.");
		System.exit(0);
	}

}
