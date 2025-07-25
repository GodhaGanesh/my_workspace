import java.util.*;
class RepeatedElement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine; //missing parenthesis

		for (int i = 0;i<str.length();i++)
		{
			boolean repeat = false;
			for (int j = i+1; j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j)){
					repeat = true;
					break;
				}
			}
			if(!repeat){
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
