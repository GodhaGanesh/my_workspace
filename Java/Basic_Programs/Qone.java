import java.util.Scanner;
class Qone 
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
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||(ch>='0'&&ch<='9'))
			{
				res=res+ch;
			}
		}
		System.out.println(res);
	}
}
