package ch07;

public class StudentTest {

	public static void main(String[] args) {
		Undergraduate s1 = new Undergraduate("홍길동", "201701012", "소프트웨어학과", 3.88, 2);
		Graduate s2 = new Graduate("정길도", "20161234", "컴퓨터공학과", 4.12, "미정", "박교수");
		Student s3 = new Graduate("김길동", "20141235", "컴퓨터공학과", 3.88, "미정", "박교수");
		s2.setThesisTitle("정보보안");
		((Graduate)s3).setThesisTitle("빅데이터");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	
	}

}
