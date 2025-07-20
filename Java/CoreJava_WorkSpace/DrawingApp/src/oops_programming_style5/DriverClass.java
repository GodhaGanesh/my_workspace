package oops_programming_style5;

public class DriverClass {
	public static void main(String[] args) {
		Triangle t1 = new Triangle("Orange",5.6,8,10);
		Triangle t2 = new Triangle("Blue",67,12,15);
		Triangle t3 = new Triangle("green",5.4,14,20);
		Hexagon h1 = new Hexagon("blue",6.5);
		Hexagon h2 = new Hexagon("orange",8.2);
		Pentagon p1 = new Pentagon("Yellow",4.5);
		Pentagon p2 = new Pentagon("orange", 6.2);
		
		t1.details();
		t2.details();
		t3.details();
		h1.display();
		h2.display();
		p1.display();
		p2.display();
		
	}
}

//for triangle include base and height attribute
//validation rule base: 5 - 20
//height : 7 - 30
//define area of triangle