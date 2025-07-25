import java.util.Scanner;
class IasExamEligible 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age  : ");
		int Age = sc.nextInt();

		if (Age>=21&&Age<=32)
		{
			System.out.println("  You Are Eligible For The IAS Exam ");
		}
		else
		{
			System.out.println("  You Are Not Eligible For The IAS Exam ");
		}
	}
}
