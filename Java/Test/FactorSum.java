import java.util.*;
class FactorSum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int sum = 0;
		for(i = 2;i<num;i+=2)	//Declaration Missing for i;
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
		}
		System.out.println("The Sum of even factors is " +sum);
	}
}
