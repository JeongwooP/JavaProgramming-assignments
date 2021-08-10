package ch03;

import java.util.Scanner;

public class Birth {

	public static void main(String[] args) {
		String birth;
		int year, month, day;
		Scanner input = new Scanner(System.in);
		System.out.println("생년월일을 여섯 자리로 입력-");
		birth = input.nextLine();
		if(birth.length() < 6) {
			System.out.println("6자리를 입력하시오");
			System.exit(0);
		}
		year = Integer.parseInt(birth.substring(0,2));
		month = Integer.parseInt(birth.substring(2,4));
		day = Integer.parseInt(birth.substring(4,6));
		
		System.out.println("19" + year + "년 " + month + "월 " 
					+ day + "일입니다.");
	}

}
