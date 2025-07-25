import java.util.Scanner;
class ForLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if(a<=5)
		{
			for (int i = 1;i<=a;i++)
			{
				System.out.println("Java	");
			}
		}
		else
		{
			System.out.println("Enter The Valid");
		}
	}
}
