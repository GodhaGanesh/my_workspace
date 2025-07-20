package approach_1_program;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Starts");
		System.out.print("Enter the a value :- ");
		int a = sc.nextInt();
		System.out.print("Enter the b value :- ");
		int b = sc.nextInt();
		double c = a/b;
		System.out.println(c);
	}
}