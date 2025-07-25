import java.util.Scanner;
class Qfive
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String st=sc.nextLine();
		String vowel = "";
		String remain = "";

		for (int i = 0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vowel=vowel+ch;
			}
			else{
				remain = remain+ch;
			}
		}
		System.out.println(vowel);
		System.out.println(remain);
	}
}
