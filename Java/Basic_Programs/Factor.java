import java.util.Scanner;
class Factor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int Factor = 0;

		System.out.print("Enter the Number To Find Factors ::-- ");
		int Num = sc.nextInt();

		System.out.print(" Factor Of '"+Num+"' Are ::--  ");

		for (int i=1;i<=Num;i++)
		{
			if (Num%i==0)
			{
				System.out.print(i+"  ");
			}
		}
	}
}
