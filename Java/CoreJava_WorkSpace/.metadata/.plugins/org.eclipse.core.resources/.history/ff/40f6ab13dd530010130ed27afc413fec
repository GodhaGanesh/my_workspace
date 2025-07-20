package oops_programming_style7;

public class Book {
	private int discount = 0;
	private static String authorName = "cherry Bhai";
	private String title;
	private int pagesCount;
	private double price;
	private double sellingPrice;
	
	public void newBook(String title, int pagesCount, double price) {
		if(BookValidation.verifyTitle(title) && BookValidation.verifyPages(pagesCount) && BookValidation.verifyPrice(price)) {
			this.title = title;
			this.pagesCount = pagesCount;
			this.price = price;
			this.sellingPrice = price;
		}
		else
			System.err.println("Credentials invalid try again!!");
	}
	
	public void addDiscount() {
		discount = discount+20;
		sellingPrice = (price*(100-discount))/100;
	}
	
	public void display() {
		if (this.title == null) {
			return;
		}
		System.out.println("-------- "+title+" -------");
		System.out.println();
		System.out.println(" Written By "+authorName);
		System.out.println(" in "+pagesCount+" pages");
		System.out.println(" price : "+price);
		System.out.println(" discount : "+discount+"%");
		System.out.println(" Selling Price : "+sellingPrice);
		System.out.println();
		System.out.println("----- Saved Amount : "+(price-sellingPrice)+"-----");
		System.out.println();
		System.out.println();
		System.out.println();
	}
}