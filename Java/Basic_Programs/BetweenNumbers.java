import java.util.Scanner;
class BetweenNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Starting Number :- ");
		int Start = sc.nextInt();

		System.out.print("Enter The Ending Number :- ");
		int End = sc.nextInt();

		
		if (Start+1==End||End+1==Start)
		{
			System.out.println("---------There Are no Between Numbers------------");
		}
		else
		{
			if(Start<End)
			{
					System.out.print("In Between Numbers are :- ");
					for (int i = Start+1;i<End;i++)
					{
						System.out.print(i+" ");
					}
			}
			else if (Start>End)
			{
				System.out.println("------------Starting point is Greater Than Ending Point--------------");
				System.out.println("But The Between Numbers Are :- ");
				
				for (int i = End+1;i<Start;i++)
				{
					System.out.print(i+" ");
				}
			}
		}
		if (Start==End)
		{
			System.out.println("!!ERROR!! INVALID INPUTS  BOTH POINTS ARE EQUAL");
		}
	}
}
