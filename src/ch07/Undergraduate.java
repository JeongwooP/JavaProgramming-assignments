package ch07;

public class Undergraduate extends Student{
	private int grade;
	
	public Undergraduate(String name, String num, String major, double gpa, 
			int grade) {
		super(name, num, major, gpa);
		this.grade = grade;
	}
	public String toString() {
		return "�̸�=" + name + ", �й�=" + num + ", �а�=" + major +
				", ����=" + gpa + ", �г�=" + grade;
	}
}
