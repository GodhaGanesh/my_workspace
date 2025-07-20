package oops_programming_style2;

public class Circle {
	public static double pi = 3.14;
	public double r;
	
	public void radius(int a) {
		r = a;
	}
	public void findArea() {
		System.out.println("Area          : "+(pi*r*r));
	}
	public void findCircumference() {
		System.out.println("Circumference : "+(2*pi*r));
	}
	public void display() {
		System.out.println("Pi            : "+pi);
		System.out.println("Radius        : "+r);
		findArea();
		findCircumference();
	}
}
