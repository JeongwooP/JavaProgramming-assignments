package ch03;

import java.util.Scanner;

public class Birth {

	public static void main(String[] args) {
		String birth;
		int year, month, day;
		Scanner input = new Scanner(System.in);
		System.out.println("��������� ���� �ڸ��� �Է�-");
		birth = input.nextLine();
		if(birth.length() < 6) {
			System.out.println("6�ڸ��� �Է��Ͻÿ�");
			System.exit(0);
		}
		year = Integer.parseInt(birth.substring(0,2));
		month = Integer.parseInt(birth.substring(2,4));
		day = Integer.parseInt(birth.substring(4,6));
		
		System.out.println("19" + year + "�� " + month + "�� " 
					+ day + "���Դϴ�.");
	}

}
