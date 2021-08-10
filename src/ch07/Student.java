package ch07;

public class Student {
	protected String name, num, major;
	protected double gpa;
	
	public Student(String name, String num, String major, double gpa) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.gpa = gpa;
	}
	public String toString() {
		return "이름=" + name + ", 학번=" + num + ", 학과=" + major +
				", 성적=" + gpa;
	}
	
}
