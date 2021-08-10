package ch08;

import java.util.Arrays;

public class BookSortDemo {

	public static void main(String[] args) {
		Book[] bookArray = new Book[5];
		bookArray[0] = new Book("���Ƕ�", 20000);
		bookArray[1] = new Book("�ڹ�", 38000);
		bookArray[2] = new Book("����", 12000);
		bookArray[3] = new Book("���", 15000);
		bookArray[4] = new Book("���ø��", 26000);

		Arrays.sort(bookArray);
		for(Book b : bookArray)
			System.out.println(b.toString());
	}

}
