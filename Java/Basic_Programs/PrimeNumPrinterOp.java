class PrimeNumPrinterOp
{
	public static void main(String[] args) 
	{
		System.out.println("--------Prime Numbers 1 to 100 ---------");
		
		for (int i = 1;i<=1000000;i++)
		{
			if (i%2==0)
			{
				continue;
			}
			else
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
}
