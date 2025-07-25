import java.util.Scanner;
class Capitalize 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the String :- ");
		String str = sc.nextLine();
		String res = "";

		for (int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch+=32;
			}
			res+=ch;
		}
		System.out.println(res);
	}
}
