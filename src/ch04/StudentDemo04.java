package ch04;

public class StudentDemo04 {

	public static void main(String[] args) {
		Student04 s1 = new Student04("홍길동", "201611222", "컴퓨터공학", 2);
		Student04 s2 = new Student04();
		s2.setInfo("김전자", "201711012", "전자공학", 1);
		s1.writeInfo();
		s2.writeInfo();
	}

}
