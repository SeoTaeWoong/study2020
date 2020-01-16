package class_1;

public class BookShop {
	private String bookName;
	private String author;
	private int price;
	
	public void setBookName(String bookName) {
		System.out.println("this :" +this);
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
}
