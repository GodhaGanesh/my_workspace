import java.util.Scanner;
class SumOfFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Number : ");
		int Num = sc.nextInt();

		int Sum=0;
		
		for (int i=1;i<=Num;i++)
		{
			if (Num % i == 0)
			{
				Sum = Sum + i;
			}
		}
		System.out.println("Sum of the factors of '"+Num+"' is : "+Sum);
	}
}
