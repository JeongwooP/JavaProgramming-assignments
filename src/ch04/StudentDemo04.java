package ch04;

public class StudentDemo04 {

	public static void main(String[] args) {
		Student04 s1 = new Student04("ȫ�浿", "201611222", "��ǻ�Ͱ���", 2);
		Student04 s2 = new Student04();
		s2.setInfo("������", "201711012", "���ڰ���", 1);
		s1.writeInfo();
		s2.writeInfo();
	}

}
