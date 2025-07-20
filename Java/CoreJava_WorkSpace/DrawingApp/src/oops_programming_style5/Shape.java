package oops_programming_style5;

public class Shape {
	private String color;
	private double outlineThickness;
	
	public Shape(String color,double outlineThickness) {
		if (GenericValidation.checkColor(color)) {
			this.color = color;
		}
		else {
			System.err.println(" Invalid Color !!");
		}
		if (GenericValidation.checkThickness(outlineThickness)) {
			this.outlineThickness = outlineThickness;
		}
		else {
			System.err.println(" Invalid Thickness !!");
		}
	}
	
	public void display() {
		if(this.outlineThickness == 0.0 || this.color == null)
			return;
		System.out.println("-------------------------");
		System.out.println("     "+this.getClass().toString().substring(30)+" Details ");
		System.out.println("-------------------------");
		System.out.println("  Color : "+color);
		System.out.println("  Thickness : "+outlineThickness);
	}
}
