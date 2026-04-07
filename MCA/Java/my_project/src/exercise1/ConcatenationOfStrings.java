package exercise1;

import java.util.Scanner;

public class ConcatenationOfStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st String: ");
		String str1 = sc.nextLine();
		System.out.print("Enter the 2nd String: ");
		String str2 = sc.nextLine();
		System.out.println("Result : "+str1+" and "+str2);
		sc.close();
	}
}
