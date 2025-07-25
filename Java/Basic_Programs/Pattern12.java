class Pattern12 
{
	public static void main(String[] args) 
	{
		int Star = 1;

		System.out.println();
		System.out.println();

		for (int i = 1;i<=9;i++)
		{
			for (int a = 1;a<=Star;a++)
			{
				System.out.print("  *  ");
			}
			if (i<=4)
			{
				Star++;
			}
			else
			{
				Star--;
			}
			System.out.println();
			System.out.println();
		}
	}
}
