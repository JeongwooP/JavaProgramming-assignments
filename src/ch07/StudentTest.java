package ch07;

public class StudentTest {

	public static void main(String[] args) {
		Undergraduate s1 = new Undergraduate("ȫ�浿", "201701012", "����Ʈ�����а�", 3.88, 2);
		Graduate s2 = new Graduate("���浵", "20161234", "��ǻ�Ͱ��а�", 4.12, "����", "�ڱ���");
		Student s3 = new Graduate("��浿", "20141235", "��ǻ�Ͱ��а�", 3.88, "����", "�ڱ���");
		s2.setThesisTitle("��������");
		((Graduate)s3).setThesisTitle("������");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	
	}

}
