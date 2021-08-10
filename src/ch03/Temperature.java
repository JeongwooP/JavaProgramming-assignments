package ch03;

import javax.swing.JOptionPane;

public class Temperature {

	public static void main(String[] args) {
		String tmp, message1 = "", message2 = "";
		char deter;
		double numB, numC = 0;
		tmp = JOptionPane.showInputDialog("º¯È¯ÇÒ ¿Âµµ ÀÔ·Â");
		deter = tmp.charAt(tmp.length()-1);
		numB = Double.parseDouble(tmp.substring(0, tmp.length()-1));
		switch(deter) {
		case 'F':
		case 'f':
			numC = (numB - 32) / 1.8;
			message1 = "È­¾¾";
			message2 = "¼·¾¾";
			break;
		case 'C':
		case 'c':
			numC = numB * 1.8 + 32;
			message1 = "¼·¾¾";
			message2 = "È­¾¾";
			break;
		}
		
		JOptionPane.showMessageDialog(null, message1 + numB + "µµ´Â "
				+ message2 + numC + "µµ ÀÔ´Ï´Ù.");
		System.exit(0);
	}

}
