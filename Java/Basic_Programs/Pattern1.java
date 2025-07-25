//waptp Pattern of * 3x3 ?
class Pattern1 
{
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println();
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if (i==j)
				{
					System.out.print("  *  ");
				}
				else
				{
					System.out.print("  -  ");
				}
			}
			System.out.println();
			System.out.println();
		}
		System.out.println();
	}
}
