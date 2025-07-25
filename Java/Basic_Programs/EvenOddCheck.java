import java.util.Scanner;
class EvenOddCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int p = sc.nextInt();

		if(p==0)
		{
			System.out.println(" Zero cannot be a Even or odd ");
		}
		else
		{
			if ((p%2)==0)
			{
				System.out.println(p+" is an even number");
			}
			else
			{
				System.out.println(p+"is an odd number");
			}
		}
	}
}
