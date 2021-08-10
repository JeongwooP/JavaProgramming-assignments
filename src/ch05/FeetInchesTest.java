package ch05;

import java.util.Scanner;

public class FeetInchesTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Feet - inch");
		FeetInches len1 = new FeetInches(5, 10);
		FeetInches len2 = new FeetInches(input.nextLine().trim());
		
		System.out.printf("len1 : %s = %.2fcm\n", len1.toString(),
				len1.getCentiMeter());
		System.out.printf("len2 : %s = %.2fcm\n", len2.toString(),
				len2.getCentiMeter());
		FeetInches len3 = len1.plus(len2);
		System.out.printf("len3=len1+len2 : %s = %.2fcm\n", len3.toString(),
				len3.getCentiMeter());
		FeetInches len4 = len3.times(3);
		System.out.printf("len4=len3*3 : %s = %.2fcm\n", len4.toString(),
				len4.getCentiMeter());
		FeetInches len5 = len1.minus(len2);
		System.out.printf("len5=len1-len2 : %s = %.2fcm\n", len5.toString(),
				len5.getCentiMeter());
	}

}
