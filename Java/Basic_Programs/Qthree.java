import java.util.Scanner;
class Qthree
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
			if(ch==' '||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				res=res+ch;
			}
		}
		System.out.println(res);
	}
}
