package oops_programming_style3;

public class DriverClass {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		book1.newBook("I Will Do",150,500.45);
		book2.newBook("I Can", 368, 657.67);
		book3.newBook("Can Can", 298, 670.5);
		
		book2.addDiscount();
		book2.addDiscount();
		
		book1.display();
		book2.display();
		book3.display();
	}
}
