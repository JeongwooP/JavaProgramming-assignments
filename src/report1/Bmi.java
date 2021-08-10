package report1;

import javax.swing.JOptionPane;

public class Bmi {

	public static void main(String[] args) {
		double kWeight, cmHeight;
		String cm = JOptionPane.showInputDialog("키를 입력하시오(cm):");
		String kg = JOptionPane.showInputDialog("체중을 입력하시오(kg):");
		
		cmHeight = Double.parseDouble(cm);
		kWeight = Double.parseDouble(kg);
	
		double bmi = kWeight / ((cmHeight * 0.01) * (cmHeight * 0.01));
		
		JOptionPane.showMessageDialog(null, "체질량지수(BMI) = " + bmi);
		System.exit(0);
	}
}