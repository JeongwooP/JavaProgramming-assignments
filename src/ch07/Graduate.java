package ch07;

public class Graduate extends Student{
	private String thesis, professor;
	
	public Graduate(String name, String num, String major, double gpa, 
			String thesis, String professor) {
		super(name, num, major, gpa);
		this.thesis = thesis;
		this.professor = professor;
	}
	public void setThesisTitle(String thesis) {
		this.thesis = thesis;
	}
	
	public String toString() {
		return "이름=" + name + ", 학번=" + num + ", 학과=" + major +
				", 성적=" + gpa + ", 논문주제=" + thesis + ", 지도교수=" + professor;
	}

}
