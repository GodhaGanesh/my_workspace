import java.util.Scanner;
class Qtwelve
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String st=sc.nextLine();
		String vowel = "";
		String remain = "";
		String digit = "";
		String symbol = "";

		for (int i = 0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vowel=vowel+ch;
			}
			else if (ch>='0'&&ch<='9')
			{
				digit = ch+digit;
			}
			else if (!((ch>='b'&&ch<='z')||(ch>='B'&&ch<='Z')))
			{
				symbol = ch+symbol;
			}
			else{
				remain = ch+remain;
			}
		}
		System.out.println(remain+symbol+vowel+digit);
	}
}
