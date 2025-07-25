import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius Of Circle : ");
		double r = sc.nextDouble();
		System.out.println("Area Of Circle : " + (3.14 * r * r));
		sc.close();
	}
}