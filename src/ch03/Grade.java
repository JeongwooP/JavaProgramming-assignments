package ch03;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("입력");
		String grade = "unknown";
		double sum = 0, count = 0;
		while(!grade.isEmpty()) {
			grade = input.nextLine();
			if(grade.equals("A+")) {
				sum += 4.5;
				count++;
			}else if(grade.equals("A")) {
				sum += 4.0;
				count++;
			}else if(grade.equals("B+")) {
				sum += 3.5;
				count++;
			}else if(grade.equals("B")) {
				sum += 3.0;
				count++;
			}else if(grade.equals("C")) {
				sum += 2.0;
				count++;
			}
		}
		System.out.println("평균 평점 = " + sum/count);
	}

}
