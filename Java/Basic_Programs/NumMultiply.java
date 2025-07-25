import java.util.Scanner;
class NumMultiply
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:-  ");
		String st = sc.nextLine();
		String digit="";
		String res="";
		String Alpha="";

		for (int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			
			if (ch>='0'&&ch<='9')
			{
				digit+=ch;
			}
			else
			{
				if (digit!="")
				{
					for (int j=0;j<Integer.parseint(digit);j++)
					{
						res+=ch;
					}
					digit="";
					Alpha=ch+"";
				}
			}
		}
	}
}
