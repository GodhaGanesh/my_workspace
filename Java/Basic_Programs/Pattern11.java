class Pattern11 
{
	public static void main(String[] args) 
	{
		int Space = 0;
		int Star = 9;

		System.out.println();
		System.out.println();
		for (int i = 0;i<=5;i++)
		{
			for (int a = 1;a<=Space;a++)
			{
				System.out.print("     ");
			}
			for (int b = 1;b<=Star;b++)
			{
				System.out.print("  *  ");
			}
			Space++;
			Star-=2;
			System.out.println();
			System.out.println();
		}

	}
}
