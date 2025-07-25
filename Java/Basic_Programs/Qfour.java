import java.util.Scanner;
class Qfour
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String st=sc.nextLine();
		String res = "";
		int word=1;

		for (int i = 0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch==' ')
			{
				word++;
			}
			if(word%2!=0)
			{
				if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
				{
					res=res+ch;
				}
			}
			else
			{
				res=res+ch;
			}
		}
		System.out.println(res);
	}
}
