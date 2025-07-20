package oops_programming_style4;

public class Hexagon {
	private String color;
	private double outlineThickness;
	
	public Hexagon(String color,double outlineThickness){
		if (HexagonValidation.checkColor(color)) {
			this.color = color;
		}
		else {
			System.err.println(" Invalid Color !!");
		}
		if (HexagonValidation.checkThickness(outlineThickness)) {
			this.outlineThickness = outlineThickness;
		}
		else {
			System.err.println(" Invalid Thickness !!");
		}
	}
	
	public void display() {
		if(this.outlineThickness == 0.0 || this.color.equals(""))
			return;
		System.out.println("-------------------------");
		System.out.println("  Color : "+color);
		System.out.println("  Thickness : "+outlineThickness);
		System.out.println("-------------------------");
	} 
}
