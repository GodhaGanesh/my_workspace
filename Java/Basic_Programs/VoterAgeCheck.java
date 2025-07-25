import java.util.Scanner;
class VoterAgeCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Age : ");
		int Age = sc.nextInt();

		if(Age>=18)
		{
			System.out.println(" You Are Eligible For Voting");
		}
		else
		{
			System.out.println(" You Are Not Eligible For Voting");
		}
	}
}
