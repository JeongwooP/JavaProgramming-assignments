package ch07;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new SalariedEmployee("ȫ", "Planning", 42000000);
		Employee e2 = new HourlyEmployee("��", "R&D", 20000, 120);
		
		System.out.printf("%s, �� �޿�=%,d��\n", e1.toString(), e1.getMonthlyPay());
		System.out.printf("%s, �� �޿�=%,d��\n", e2.toString(), e2.getMonthlyPay());
	}

}
