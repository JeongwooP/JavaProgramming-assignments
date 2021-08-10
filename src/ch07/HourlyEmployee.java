package ch07;

public class HourlyEmployee extends Employee{
	private int hourlyPay, monthlyLabor;
	
	public HourlyEmployee(String name, String dept, int hourlyPay, int monthlyLabor) {
		super(name, dept);
		this.hourlyPay = hourlyPay;
		this.monthlyLabor = monthlyLabor;
	}
	
	public int getMonthlyPay() {
		return hourlyPay*monthlyLabor;
	}
	
}
