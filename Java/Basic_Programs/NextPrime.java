import java.util.Scanner;
class NextPrime 
{
	public static int nextPrimeOf(int Num)
	{
		for (int i = Num+1;i!=0;i++)
		{
			if(i%2==0&&i!=2)
			{
				continue;
			}
			else
			{
				int Factor=0;
				for (int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						Factor++;
					}
				}
				if (Factor==0)
				{
					return i;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Number To find it's next prime number:-  ");
		int Num = sc.nextInt();

		System.out.println("It is nothing but :-  "+nextPrimeOf(Num));
	}
}