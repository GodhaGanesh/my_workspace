package bean_programming;

public class Book {

	private int id;
	private String title;
	private String author;
	private double cost;
	private int pageCount;
	public Book() {
	}
	public Book(int id, String title, String author, double cost, int pageCount) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.cost = cost;
		this.pageCount = pageCount;
	}
	@Override
	public String toString() {
		return "Book\n-------\n"
				+ "id = " + id + "\n title = " + title + "\n author = " + author + "\n cost=" + cost;
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void Display() {
		System.out.println("Book Id : "+getId());
		System.out.println("Book Title : "+getTitle());
		System.out.println("Author : "+getAuthor());
		System.out.println("Pages : "+getPageCount());
		System.out.println("Cost : "+getCost());
	}
}
