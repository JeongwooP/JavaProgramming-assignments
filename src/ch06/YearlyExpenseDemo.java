package ch06;

public class YearlyExpenseDemo {

	public static void main(String[] args) {
		YearlyExpense expense = new YearlyExpense();
		expense.readInfo();
		System.out.println("�����=" + expense.getMonthlyAvg());
		System.out.println("�ִ� �����=" + expense.getMaxMonth() +
				", �����=" + expense.getExpense(expense.getMaxMonth()));
	}

}
