package ch08;

public class Book implements Comparable{
	private String title;
	private int price;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String toString() {
		return "제목=" + title + ", 가격=" + price;
	}
	
	@Override
	public int compareTo(Object obj) {
		if (obj != null && obj instanceof Book) {
			Book b = (Book)obj;
			return b.title.compareTo(this.title);
		}
		else
			return -1;
		
	}
}
