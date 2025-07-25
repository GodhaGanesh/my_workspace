import java.util.Scanner;
class fourteen
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String st=sc.nextLine();
		String res = "";
		int sum = 0;

		for (int i = 0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch+=32;
			}
			if (ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&!(ch>='0'&&ch<='9'))
			{
				res=res+ch;
			}
			if (ch>='0'&&ch<='9')
			{
				String num = ""+ch;
				sum = sum + Integer.parseInt(num);
			}
		}
		System.out.println(res+sum);
	}
}
