package ch10;

public class Student {
	private String name;
	private String grade;
	
	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	public String toString() {
		return "�̸�:" + name + ", ������ " + grade; 
	}
	
	public String getName() {
		return name;
	}
	
	public String getGrade() {
		return grade;
	}
}
