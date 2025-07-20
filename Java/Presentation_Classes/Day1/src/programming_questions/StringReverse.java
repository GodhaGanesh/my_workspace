package programming_questions;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a String :- ");
		String str = sc.nextLine();
		
		System.out.println("Reverse of "+str+" is "+'"'+revStr(str)+'"');
	}
	
	public static String revStr(String str) {
		String rev = "";
		for(int i = 0; i<str.length();i++)
			rev = str.charAt(i)+rev;
		return rev;
	}
}
