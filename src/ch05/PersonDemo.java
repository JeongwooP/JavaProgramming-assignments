package ch05;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Mary Black", 22);
		Person p2 = new Person("ȫ �浿", 24);
		Person p3 = new Person("ȫ", "�浵", 22);
		
		System.out.println("p1: " + p1.toString());
		System.out.println("p2: " + p2.toString());
		System.out.println("p3: " + p3.toString());
		System.out.println("p2.equals(p3): " + p2.equals(p3));
		System.out.println("p2.hasSameName(p3): " + p2.hasSameName(p3));
		System.out.println("p2.hasSameFamilyName(p3): " + p2.hasSameFamilyName(p3));
	}

}
