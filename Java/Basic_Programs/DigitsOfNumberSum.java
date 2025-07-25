//WAPTP sum of the digits of a number.
import java.util.Scanner;
class  DigitsOfNumberSum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number :- ");
		int Num = sc.nextInt();

		int Sum=0;

		while(Num!=0)
		{
			int LastDigit = Num%10;
				Sum = Sum + LastDigit;
				Num = Num/10;
		}
		System.out.println("sum of the digits of a number : "+Sum);

	}
}
