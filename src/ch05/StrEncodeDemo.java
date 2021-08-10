package ch05;

import java.util.Scanner;

public class StrEncodeDemo {

	public static void main(String[] args) {
		StrEncoder encoder1 = new StrEncoder(3);
		
		System.out.println("ют╥б-");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine().trim();
		String encStr1 = encoder1.encode(str);
		
		System.out.println("encoded with key=3:" + encStr1);
		
		System.out.println("decoded (key=3):" + encoder1.decode(encStr1));

	}

}
