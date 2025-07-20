package oops_programming_style1;

public class Circle {
	public static double pi = 3.14;
	public double r;
	
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		
		circle1.r = 10;
		circle2.r = 3;
		
		double area1 = pi*circle1.r*circle1.r;
		double area2 = pi*circle2.r*circle2.r;
		double circumference1 = 2*pi*circle1.r;
		double circumference2 = 2*pi*circle2.r;
		
		System.out.println("----------- Circle 1 details-----------");
		System.out.println(" pi : "+pi);
		System.out.println(" Radius : "+circle1.r);
		System.out.println(" Area : "+area1);
		System.out.println(" Circumference : "+circumference1);
		
		System.out.println("----------- Circle 2 details-----------");
		System.out.println(" pi : "+pi);
		System.out.println(" Radius : "+circle2.r);
		System.out.println(" Area : "+area2);
		System.out.println(" Circumference : "+circumference2);
	}
}