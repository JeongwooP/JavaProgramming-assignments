package ch09;

import java.util.Scanner;

public class StringExceptionDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("문장을 입력: ");
		String word = input.nextLine();
		System.out.println("인덱스를 입력: ");
		int n = input.nextInt();
		try {
		char ch = word.charAt(n);
		System.out.println(n + "번째 문자=" + ch);
		}
		catch(StringIndexOutOfBoundsException e) {
		System.out.println("오류 : 스트링 인덱스의 범위가 벗어남, 인덱스=" + n);
		}
	}

}
