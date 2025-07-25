import java.util.*;
class PrimeDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give a Number : ");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0)
		{
			int ld = num %10;
			boolean isPrime = true;
			for(int i = 2; i<ld; i++){
				if (ld%i==0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			{
				sum = sum+ld;
			}
			// num = num/10; statement missing here;
		}
		//printing statement missing System.out.println("The sum is: "+sum);
	}
}
