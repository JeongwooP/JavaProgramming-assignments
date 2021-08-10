package ch07;

public class SalariedEmployee extends Employee{
	private int yearlyPay;
	
	public SalariedEmployee(String name, String dept, int yearlyPay) {
		super(name, dept);
		this.yearlyPay = yearlyPay;
	}
	
	public int getMonthlyPay() {
		return yearlyPay/12;
	}
	
}
