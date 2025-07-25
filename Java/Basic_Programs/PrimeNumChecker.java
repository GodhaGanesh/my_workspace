import java.util.Scanner;
class PrimeNumChecker
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------Prime Number Checker-------------");
		System.out.print("Enter the Number To check : ");
		int Num = sc.nextInt();
		int Count = 0;

		for (int i = 1;i<=Num;i++)
		{
			if(Num%i==0)
			{
				Count++;
			}
		}
		if(Count==2)
		{
			System.out.println(Num+" is a Prime number");
		}
		else
		{
			System.out.println(Num+" is not a Prime number");
		}
	}
}