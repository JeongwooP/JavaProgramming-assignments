package ch05;

public class MyTimeDemo {

	public static void main(String[] args) {
		MyTime t1 = new MyTime(19, 5);
		System.out.println("t1: " + t1);
		MyTime t2 = t1.forward(3, 20);
		System.out.println("t2: " + t2);
		MyTime t3 = t1.forward(2, 20);
		System.out.println("t3: " + t3);
		
		MyTime t4 = new MyTime("02:25");
		System.out.println("t4: " + t4);
		MyTime t5 = t4.backward(3, 55);
		System.out.println("t5: " + t5);

	}

}
