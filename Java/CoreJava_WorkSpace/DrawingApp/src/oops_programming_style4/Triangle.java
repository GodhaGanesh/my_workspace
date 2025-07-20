package oops_programming_style4;

public class Triangle {
	
	private String color;
	private double outlineThickness;
	
	public Triangle(String color,double outlineThickness){
		if (TriangleValidation.checkColor(color)) {
			this.color = color;
		}
		else {
			System.err.println(" Invalid Color !!");
		}
		if (TriangleValidation.checkThickness(outlineThickness)) {
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
		System.out.println("  Color : "+color);
		System.out.println("  Thickness : "+outlineThickness);
		System.out.println("-------------------------");
	}
}
