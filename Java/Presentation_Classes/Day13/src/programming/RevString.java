package programming;

import java.util.Scanner;

public class RevString {
	public static void main(String[] args) {
		System.out.print("Give me a String :- ");
		String str = (new Scanner(System.in)).nextLine(), res = "";
		System.out.println(str);
		int j = str.length() - 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				res += ' ';
				continue;
			}
			j = str.charAt(j) == ' ' ? j - 1 : j;
			res = res + str.charAt(j--);
		}
		System.out.println(res);
	}
}