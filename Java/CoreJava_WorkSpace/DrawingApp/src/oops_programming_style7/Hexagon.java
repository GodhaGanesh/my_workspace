package oops_programming_style7;

public class Hexagon extends Shape {
	
	private double side;
	public Hexagon(String color,Outline outline, double side){
		super(color,outline);
		if(HexagonValidation.verifySide(side)) {
			this.side = side;
			this.area = area();
		}
		else
			System.err.println("invalid inputs....");
	}

	@Override
	public double area() {
		return (3 * Math.sqrt(3)/2.0)*side*side;
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
