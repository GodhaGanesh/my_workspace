class Pattern14
{
	public static void main(String[] args)
	{
		int Space = 4;
		int Star = 1;

		System.out.println();
		System.out.println();

		for (int i = 1;i<=9;i++)
		{
			for (int a = 1;a<=Space;a++)
			{
				System.out.print("     ");
			}
			for (int b = 1;b<=Star;b++)	
			{
				System.out.print("  *  ");
			}
			if (i<=4)
			{
				Star+=2;
				Space--;
			}
			else
			{
				Star-=2;
				Space++;
			}

			System.out.println();
			System.out.println();
		}
	}
}