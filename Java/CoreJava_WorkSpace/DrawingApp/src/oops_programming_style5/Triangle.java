package oops_programming_style5;

public class Triangle extends Shape {
	private int height;
	private int base;
	private double area;
	
	public Triangle(String color,double outlineThickness, int height, int base){
		super(color,outlineThickness);
		if(TriangleValidation.verifyHeight(height) && TriangleValidation.verifyBase(base)) {
			this.height = height;
			this.base = base;
			area = 0.5*base*height;
		}
		else
			System.err.println("invalid inputs....");
	}
	
	public void details() {
		if (height == 0 || base == 0) {
			return;
		}
		display();
		System.out.println("  height : "+height);
		System.out.println("  base : "+base);
		System.out.println("  area : "+area);
		System.out.println("-----------------------");
	}
}