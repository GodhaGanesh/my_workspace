import java.util.Scanner;
class thirteen
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String st=sc.nextLine();
		String res = "";

		for (int i = 0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch+=32;
			}
			res=res+ch;
		}
		System.out.println(res);
	}
}
