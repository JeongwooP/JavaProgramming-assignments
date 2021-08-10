package ch04;

public class Book {
	String title, author;
	int price;
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void discountBy(int d) {
		price = price - price*d/100;
	}
	
	public void writeInfo() {
		System.out.println("제목 : " + title + ", 저자: " + author + ", 가격: " + price);
	}
	
}
