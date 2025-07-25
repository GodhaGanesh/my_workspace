import java.util.Scanner;
class NPrime 
{
	public static boolean isPrime(int num) 
	{
		if (num < 2) return false;
		for (int i = 2; i*i<= num; i++)
		{
			if (num % i == 0) return false;
		}
		return true;
    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N value:-  ");
		int n = sc.nextInt();
		int Count=0,num=1;

		while (Count<n)
		{
			num++;
			if(isPrime(num))
			{
				Count++;
			}
		}
		System.out.println(num);
	}
}
