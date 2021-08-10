package ch10;

import java.util.ArrayList;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		ArrayList<Double> numbers = new ArrayList<>(5);
		double sum = 0;
		System.out.println("음수가 아닌 실수 값을 입력.");
		Scanner input = new Scanner(System.in);
		while(true) {
			double a = input.nextDouble();
			if(a < 0)
				break;
			numbers.add(a);
			sum += a;
		}
		System.out.println("입력된 "+ numbers.size() + "개 값의 평균은 "
				+ sum/numbers.size() + "입니다.");
	}

}
