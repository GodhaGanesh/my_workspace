package programming;
import java.util.Scanner;
public class StringValidation {
	
	public static String reverse(String str) {
		String rev = "";
		for(int i = 0; i<str.length();i++) 
			rev = str.charAt(i)+rev;
		return rev;
	}
	
	public static boolean twoWords(String str) {
		return str.split(" ").length >= 2;
	}
	
	public static String lastWord(String str) {
		return reverse(str.split(" ")[(str.split(" ").length) - 1]);
	}
	
	public static String stringValidation(String str) {
		if(str.length()<14)
			return "length should be greater than 13. tryagain!!";
		if(!twoWords(str))
			return "The String should contain two or more than two words";
		String[] strList = str.split(" ");
		String res = "";
		for(int i = 0; i<strList.length - 1;i++)
			res = res + strList[i] + " ";
		res = res + lastWord(str);
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a String :- ");
		String str = sc.nextLine();
		System.out.println(stringValidation(str));
		sc.close();
	}

}
