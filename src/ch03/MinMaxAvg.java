package ch03;

import java.util.Scanner;

public class MinMaxAvg {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int e, max, min , sum = 0;
		double count = 0;
		e = s.nextInt();
		max = e;
		min = e;
		while(e > -1) {
			count ++;
			sum += e;
			if(e > max)
				max = e;
			else if(e < min)
				min = e;
			e = s.nextInt();
		}
		System.out.println("�ִ밪=" + max + ",�ּҰ�=" + min + ", ��հ�=" + sum/count);
	}

}
