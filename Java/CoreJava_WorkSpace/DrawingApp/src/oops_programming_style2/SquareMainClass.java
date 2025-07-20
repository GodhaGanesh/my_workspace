package oops_programming_style2;

public class SquareMainClass {
	public static void main(String[] args) {
		Square square1 = new Square();
		Square square2 = new Square();
		Square square3 = new Square();
		
		square1.newSquare(5.6);
		square2.newSquare(8.9);
		square3.newSquare(11.5);
		
		System.out.println("---- Square 1 Details ----");
		square1.display();
		System.out.println("---- Square 2 Details ----");
		square2.display();
		System.out.println("---- Square 3 Details ----");
		square3.display();
	}
}
