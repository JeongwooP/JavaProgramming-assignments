package ch10;

import java.util.ArrayList;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		ArrayList<Double> numbers = new ArrayList<>(5);
		double sum = 0;
		System.out.println("������ �ƴ� �Ǽ� ���� �Է�.");
		Scanner input = new Scanner(System.in);
		while(true) {
			double a = input.nextDouble();
			if(a < 0)
				break;
			numbers.add(a);
			sum += a;
		}
		System.out.println("�Էµ� "+ numbers.size() + "�� ���� ����� "
				+ sum/numbers.size() + "�Դϴ�.");
	}

}
