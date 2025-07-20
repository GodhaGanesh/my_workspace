package oops_programming_style7;

abstract public class Shape {
	protected String color;
	protected Outline outline;
	protected double area;
	
	public Shape(String color,Outline outline) {
		if (GenericValidation.checkColor(color)) {
			this.color = color;
		}
		else
			System.err.println("invalid color...!");
		this.outline = outline;
	}
	
	protected void errDisplay() {
		System.err.println("this "+this.getClass().toString().substring(30)+" have invalid values in it !!");
		System.err.println(" Cant display it !!");
	}
	
	protected void veiw() {
		System.out.println("-------------------------");
		System.out.println("     "+this.getClass().toString().substring(30)+" Details ");
		System.out.println("-------------------------");
		System.out.println("  Color : "+color);
		outline.outlineDetails();
	}
	
	abstract public void display();
	
	abstract public double area();
}
