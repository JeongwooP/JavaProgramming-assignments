package ch06;

public class YearlyExpenseDemo {

	public static void main(String[] args) {
		YearlyExpense expense = new YearlyExpense();
		expense.readInfo();
		System.out.println("월평균=" + expense.getMonthlyAvg());
		System.out.println("최대 지출월=" + expense.getMaxMonth() +
				", 지출액=" + expense.getExpense(expense.getMaxMonth()));
	}

}
