package ch09;

import java.util.Scanner;

public class StringExceptionDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է�: ");
		String word = input.nextLine();
		System.out.println("�ε����� �Է�: ");
		int n = input.nextInt();
		try {
		char ch = word.charAt(n);
		System.out.println(n + "��° ����=" + ch);
		}
		catch(StringIndexOutOfBoundsException e) {
		System.out.println("���� : ��Ʈ�� �ε����� ������ ���, �ε���=" + n);
		}
	}

}
