package report1;

import javax.swing.JOptionPane;

public class Bmi {

	public static void main(String[] args) {
		double kWeight, cmHeight;
		String cm = JOptionPane.showInputDialog("Ű�� �Է��Ͻÿ�(cm):");
		String kg = JOptionPane.showInputDialog("ü���� �Է��Ͻÿ�(kg):");
		
		cmHeight = Double.parseDouble(cm);
		kWeight = Double.parseDouble(kg);
	
		double bmi = kWeight / ((cmHeight * 0.01) * (cmHeight * 0.01));
		
		JOptionPane.showMessageDialog(null, "ü��������(BMI) = " + bmi);
		System.exit(0);
	}
}