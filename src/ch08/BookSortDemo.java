package ch08;

import java.util.Arrays;

public class BookSortDemo {

	public static void main(String[] args) {
		Book[] bookArray = new Book[5];
		bookArray[0] = new Book("정의란", 20000);
		bookArray[1] = new Book("자바", 38000);
		bookArray[2] = new Book("벌레", 12000);
		bookArray[3] = new Book("당신", 15000);
		bookArray[4] = new Book("마시멜로", 26000);

		Arrays.sort(bookArray);
		for(Book b : bookArray)
			System.out.println(b.toString());
	}

}
