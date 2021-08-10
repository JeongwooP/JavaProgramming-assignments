package report2;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("m=");
		int m = input.nextInt();
		int f0 = 0, f1 = 1, f2;
		while(true) {
			f2 = f0 + f1;
			if(f2 >= m)
				break;
			f0 = f1;
			f1 = f2;
		}
		System.out.println(f2);
	}

}