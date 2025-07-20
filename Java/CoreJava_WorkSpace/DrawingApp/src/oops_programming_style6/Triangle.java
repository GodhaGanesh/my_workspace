package oops_programming_style6;

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

	@Override
	public double area() {
		return 0.5 * base * height;
	}

	@Override
	public void display() {
		if(this.outlineThickness == 0.0 || this.color == null || height == 0 || base == 0) {
			errDisplay();
			return;
		}
		veiw();
		System.out.println("  height : "+height);
		System.out.println("  base : "+base);
		System.out.println("  area : "+area);
		System.out.println("-------------------------");
	}
}