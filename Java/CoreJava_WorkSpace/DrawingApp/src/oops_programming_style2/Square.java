package oops_programming_style2;

public class Square {
	public double sideLength;
	public double area;
	public double perimeter;
	
	public void newSquare(double sideLength) {
		this.sideLength = sideLength;
		area = sideLength*sideLength;
		perimeter = 4*sideLength;
	}
	
	public void display() {
		System.out.println(" Side Length : "+sideLength);
		System.out.println(" Area : "+area);
		System.out.println(" Perimeter : "+perimeter);
		System.out.println("---------------------------");
		System.out.println();
		System.out.println();
	}
}
