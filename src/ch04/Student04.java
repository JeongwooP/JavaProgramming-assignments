package ch04;

public class Student04 {
	String name, id, dept;
	int grade;
	
	public Student04() {
		setInfo("anonymous", "000000000", "unknown", 0);
	}
	
	public Student04(String name, String id, String dept, int grade) {
		setInfo(name, id, dept, grade);
	}
	
	public void setInfo(String name, String id, String dept, int grade) {
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.grade = grade;
	}
	public void writeInfo() {
		System.out.println("이름=" + name + ", 학번:" + id + ", " + dept 
				+ " " + grade + "학년");
	}
}
