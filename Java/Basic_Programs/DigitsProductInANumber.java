import java.util.Scanner;
class DigitsProductInANumber 
{
	public static void main(String[] args) 
	{
		Scanner ganesh = new Scanner(System.in);
		System.out.println("Enter a Number :- ");
		int Num = ganesh.nextInt();

		int =0;

		while(Num!=0)
		{
			int LastDigit = Num%10;
				Sum = Sum + LastDigit;
				Num = Num/10;
		}
		System.out.println("sum of the digits of a number : "+Sum);

	}
}
