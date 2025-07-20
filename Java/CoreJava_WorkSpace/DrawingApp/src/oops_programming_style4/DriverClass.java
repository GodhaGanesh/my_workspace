package oops_programming_style4;

public class DriverClass {
	public static void main(String[] args) {
		Triangle t1 = new Triangle("Orange",5.6);
		Triangle t2 = new Triangle("Blue",67);
		Triangle t3 = new Triangle("green",5.4);
		Hexagon h1 = new Hexagon("blue",6.5);
		Hexagon h2 = new Hexagon("orange",8.2);
		Pentagon p1 = new Pentagon("Yellow",4.5);
		
		t1.display();
		t2.display();
		t3.display();
		h1.display();
		h2.display();
		p1.display();
	}
}
