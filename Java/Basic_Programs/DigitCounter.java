//WAPT COUNT NUMBER DIGITS IN A GIVEN NUMBER.
import java.util.Scanner;
class DigitCounter
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number :- ");
		int Num = sc.nextInt();
		int Count=0;
		int Temp = Num;

		while(Num>0)
		{
			Count++;
			Num=Num/10;
		}
		System.out.println(Count+" No.Of. Digits Are there in "+Temp);
	}
}
