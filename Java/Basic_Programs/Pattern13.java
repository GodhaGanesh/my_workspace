class Pattern13
{
	public static void main(String[] args) 
	{
		int Star = 1;
		int Space = 4;

		System.out.println();
		System.out.println();

		for (int i = 1;i<=9;i++)
		{
			for (int b = 1;b<=Space;b++)
			{
				System.out.print("     ");
			}
			for (int a = 1;a<=Star;a++)
			{
				System.out.print("  *  ");
			}
			if (i<=4)
			{
				Star++;
				Space--;
			}
			else
			{
				Star--;
				Space++;
			}
			System.out.println();
			System.out.println();
		}
	}
}
