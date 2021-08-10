package ch04;

public class BookDemo {

	public static void main(String[] args) {
		Book b1 = new Book("벌레 이야기", "이청준",15000);
		b1.discountBy(15);
		b1.writeInfo();
	}

}
