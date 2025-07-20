package oops_programming_style7;

public class Pentagon extends Shape {
	private double side;
	public Pentagon(String color,Outline outline,double side){
		super(color,outline);
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
		if(this.color == null || side == 0) {
			errDisplay();
			return;
		}
		veiw();
		System.out.println("  Side : "+side);
		System.out.println("  area : "+area);
		System.out.println("-----------------------");
	}
}
