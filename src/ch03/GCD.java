package ch03;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a1 = input.nextInt();
		int a2 = input.nextInt();
		int least, gcd = 1, count = 1;
		if(a1 > a2)
			least = a2;
		else 
			least = a1;
		while(count < least/2) {
			if(a1 % count == 0 && a2 % count == 0)
				gcd = count;
			count++;
		}
		System.out.println(a1 + ", " + a2 + "최대공약수는 " + gcd + "입니다.");
	}

}
