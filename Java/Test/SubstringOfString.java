import java.util.*;
class SubstringOfString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		for(int i=0;i<str.length();i++){
			String res = "";
			for(int j=i;j<str.length();j++){
				res = res+str.charAt(j)	//semi-colon (;) missing
				System.out.println(res)	//semi-colon (;) missing
			}
		}
	}
}
