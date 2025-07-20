package java_programming;

import java.util.Scanner;

public class RemoveDuplicationInaString {
	public static String removeDuplicates(String str) {
		str = str.toLowerCase();
		String res = "";
		for(int i = 0; i < str.length(); i++) {
			boolean found = false;
			char ch = str.charAt(i);
			for(int j = 0; j < res.length(); j++) {
				char ch1 = res.charAt(j);
				if(ch == ch1) {
					found = true;
					break;
				}
			}
			if(!found) {
				res = res + ch;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a String :- ");
		String str = sc.nextLine();
		String res = removeDuplicates(str);
		System.out.println("after removing Duplicates :- "+res);
		sc.close();
	}
}
