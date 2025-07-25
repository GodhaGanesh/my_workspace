import java.util.Scanner;
class Qseven
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
				digit = digit + ch;
			}
			else if (!((ch>='b'&&ch<='z')||(ch>='B'&&ch<='Z')))
			{
				symbol = symbol +ch;
			}
			else{
				remain = remain+ch;
			}
		}
		System.out.println(vowel);
		System.out.println(remain);
		System.out.println(digit);
		System.out.println(symbol);
	}
}
