package ch06;

public class YearlyExpense {
	private int [] arr = {100, 20, 140, 160, 130, 120, 100, 180,
			160, 90, 110, 140};
	private static final int SIZE = 12;
	
	public void readInfo() {
		for(int i = 0 ; i < SIZE; i++)
			System.out.println(i+ 1 + "월의 지출=" + arr[i]);
	}
	
	public double getMonthlyAvg() {
		double sum = 0;
		for(int j = 0; j < SIZE; j++)
			sum += arr[j];
		
		return sum/SIZE;
	}
	public int getMaxMonth() {
		int max = 0, maxMonth=0;
		for(int a = 0 ; a < SIZE; a++) {
			if(max < arr[a]) {
				max = arr[a];
				maxMonth = a;
			}
		}
		return maxMonth+1;
	}
	public int getExpense(int month) {
		return arr[month-1];
	}
	public int getMinMonth() {
		int min = 0, minMonth=0;
		for(int a = 0 ; a < SIZE; a++) {
			if(min > arr[a]) {
				min = arr[a];
				minMonth = a;
			}
		}
		return minMonth+1;
	}
}
