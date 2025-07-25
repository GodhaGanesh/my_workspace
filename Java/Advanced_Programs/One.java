class One{
    public static void main(String[] args) {
		int num = 9;
        int space = num/2;
        int stars = 1;
        for (int i = 1; i<=num; i++)
		{
			for (int j = 1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=stars; k++)
			{
				System.out.print(k);
			}
			System.out.println();
			if (i<=num/2)
			{
				stars+=2;
				space--;
			}
			else
			{
				stars-=2;
				space++;
			}
        }
    }
}