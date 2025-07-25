import java.util.Scanner;
class  SimpleIntrestCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("___________________________________________________________");
		System.out.println("|               Simple Intrest Calculator                 | ");
		System.out.println("|_________________________________________________________|");
		  System.out.print("    Enter Principle Amount : ");
		  double p = sc.nextDouble();
		  System.out.print("    Enter Rate of intrest : ");
		  double r = sc.nextDouble();
		  System.out.print("    Enter Time Period: ");
		  double t = sc.nextDouble();
		  double si = (p*t*r)/100;
		System.out.println("__________________________________________________________");

	}
}
