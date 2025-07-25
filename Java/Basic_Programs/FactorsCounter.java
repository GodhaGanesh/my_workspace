import java.util.Scanner;
class FactorsCounter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : - ");
		int Num = sc.nextInt();

		System.out.print("Enter the 2nd number :- ");
		int J = sc.nextInt();

		Num++;

		for (int i=Num;J>i;i++)
		{
			System.out.println(i);
		}
	}
}
