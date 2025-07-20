package oops_programming_style6;

public class Pentagon extends Shape {
	private double side;
	public Pentagon(String color,double outlineThickness,double side){
		super(color,outlineThickness);
		if(PentagonValidation.verifySide(side)) {
			this.side = side;
			this.area = area();
		}
		else
			System.err.println("invalid inputs....");
	}

	@Override
	public double area() {
		return (1/4.0)*Math.sqrt((5*(5+2*Math.sqrt(5))))*side*side;
	}

	@Override
	public void display() {
		if(this.outlineThickness == 0.0 || this.color == null || side == 0) {
			errDisplay();
			return;
		}
		veiw();
		System.out.println("  Side : "+side);
		System.out.println("  area : "+area);
		System.out.println("-----------------------");
	}
}
