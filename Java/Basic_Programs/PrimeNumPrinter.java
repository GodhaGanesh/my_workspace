//write a program to print all the prime numbers present from 1 to 100;
class PrimeNumPrinter
{
	public static void main(String[] args) 
	{
		System.out.println("--------Prime Numbers 1 to 100 ---------");
		
		for (int i = 1;i<=100;i++)
		{
			int Count=0;

			for (int j=1;j<=i ;j++)
			{
				if(i%j==0)
				{
					Count++;
				}
			}
			if(Count==2)
			{
				System.out.print(" "+i+", ");
			}
		}
	}
}
