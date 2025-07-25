class Strong
{
	public static void main(String[] args) 
	{
		int Count=1;
		for(int num=1;Count<=5;num++)
		{
			int sum = 0;
			int temp = num;
			while(temp>0)
			{
				int factorial=1;
				int ld=temp%10;
				for (int i = 1;i<=ld;i++)
				{
					factorial=factorial*i;
				}
				sum = sum + factorial;
				temp=temp/10;
			}
			if(sum == num)
			{
				System.out.println(num);
				Count++;
			}
		}
	}
}
