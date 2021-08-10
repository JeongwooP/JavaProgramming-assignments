package ch07;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new SalariedEmployee("홍", "Planning", 42000000);
		Employee e2 = new HourlyEmployee("정", "R&D", 20000, 120);
		
		System.out.printf("%s, 월 급여=%,d원\n", e1.toString(), e1.getMonthlyPay());
		System.out.printf("%s, 월 급여=%,d원\n", e2.toString(), e2.getMonthlyPay());
	}

}
