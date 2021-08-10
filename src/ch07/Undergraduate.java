package ch07;

public class Undergraduate extends Student{
	private int grade;
	
	public Undergraduate(String name, String num, String major, double gpa, 
			int grade) {
		super(name, num, major, gpa);
		this.grade = grade;
	}
	public String toString() {
		return "이름=" + name + ", 학번=" + num + ", 학과=" + major +
				", 성적=" + gpa + ", 학년=" + grade;
	}
}
