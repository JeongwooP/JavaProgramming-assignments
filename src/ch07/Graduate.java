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
		return "�̸�=" + name + ", �й�=" + num + ", �а�=" + major +
				", ����=" + gpa + ", ������=" + thesis + ", ��������=" + professor;
	}

}
