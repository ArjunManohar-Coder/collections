package day14;

public class Book {
	
	private String author;
	private int noOfPages;
	private int price;
	private boolean isStoryBook;
	
	public void setAuthor(String author) {
		this.author=author;
		}
	public String getAuthor() {
		return author;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages=noOfPages;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setIsStoryBook(boolean isStoryBook) {
		this.isStoryBook=isStoryBook;
	}
	public boolean getIsStoryBook() {
		return isStoryBook;
	}
	
	public Book(String author,int noOfPages,int price,boolean isStoryBook) {
		this.author=author;
		this.noOfPages=noOfPages;
		this.price=price;
		this.isStoryBook=isStoryBook;
	}
	
	public String toString() {
		return author+" "+noOfPages+" "+price+" "+isStoryBook;
		
	}

	

}
