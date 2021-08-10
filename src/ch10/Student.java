package ch10;

public class Student {
	private String name;
	private String grade;
	
	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	public String toString() {
		return "이름:" + name + ", 성적은 " + grade; 
	}
	
	public String getName() {
		return name;
	}
	
	public String getGrade() {
		return grade;
	}
}
