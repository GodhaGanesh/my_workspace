package oops_programming_style2;

public class DriverClass {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.radius(3);
		circle2.radius(7);
		System.out.println("--------Circle 1 Dteails-------");
		circle1.display();
		System.out.println("--------Circle 2 Dteails-------");
		circle2.display();
	}
}
