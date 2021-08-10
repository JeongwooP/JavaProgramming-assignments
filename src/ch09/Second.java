package ch09;

import java.util.Scanner;

public class Second {
	
	public static void main(String[] args) {
		int index = 0;
		int size = 3;
		int [] arr = new int[size];
		int [] arr2 = new int[size+3];
		int sum = 0;
		double avg = 0;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("점수를 입력:");
			int num = input.nextInt();
			if(num < 0)
				break;
			try {
			arr[index] = num;
			}
			catch(Exception e) {
			System.out.println(e);
			System.out.println("increasing array size..");
			for(int i = 0 ; i < size; i++)
				arr2[i] = arr[i];
			arr2[index] = num;
			arr = arr2;
			}
			index++;
		}
		for(int i = 0 ; i < arr2.length ; i++) {
			System.out.print(i+1 + ":" + arr2[i] + " ");
			sum += arr2[i];
		}
		avg = (double)sum / (size + 3);
		System.out.println();
		System.out.println("합계=" + sum + ", 평균=" + avg);
	}

}
