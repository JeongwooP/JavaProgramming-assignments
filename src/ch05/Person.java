package ch05;

public class Person {
	private String first, last;
	private int age;
	
	public Person(String full, int age) {
		if(full.charAt(0) >= 65 && full.charAt(0) <= 90) {
			int index = full.indexOf(" ");
			last = full.substring(0, index);
			first = full.substring(index+1, full.length());
		}else {	
			first = full.substring(0, 1);
			last = full.substring(1, full.length()).trim();
		}
		this.age = age;
	}
	public Person(String a, String b, int age) {
		first = a;
		last = b;
		this.age = age;
	}
	public boolean equals(Person p) {
		if(first.equals(p.first) && last.equals(p.last))
			return true;
		else
			return false;
	}
	public boolean hasSameName(Person p) {
		if(last.equals(p.last))
			return true;
		else	
			return false;
	}
	public boolean hasSameFamilyName(Person p) {
		if(first.equals(p.first)) 
			return true;
		else	
			return false;
	}
	public String toString() {
		return first + ", " + last + ": " + age + "¼¼";
	}
}
