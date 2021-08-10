package ch07;

public class Employee {
	String name, dept;
	
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	public int getMonthlyPay() {
		return 0;
	}
	
	public String toString() {
		return "이름=" + name + ", 부서=" + dept;
	}
}
