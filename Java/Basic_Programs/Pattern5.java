class Pattern5
{
	public static void main(String[] args) 
	{
		char x='A';

		System.out.println();
		System.out.println();
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				System.out.print("  "+x+"  ");
				x++;
			}
			System.out.println();
			System.out.println();
		}
		System.out.println();
	}
}
