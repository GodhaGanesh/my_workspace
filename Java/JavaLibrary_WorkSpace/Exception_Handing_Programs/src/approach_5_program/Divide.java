package approach_5_program;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Starts");
		System.out.print("Enter the a value :- ");
		double a = sc.nextInt();
		System.out.print("Enter the b value :- ");
		double b = sc.nextInt();
		for (int i = 3; i > 0; i--) {
			try {
				System.out.println(a/b);
				break;
			}
			catch(ArithmeticException e) {
				if(i==1) {
					System.out.println("Your chances are reached max limit");
					System.err.println("You Are Blocked !!");
					break;
				}
				System.out.println("you have only "+i+" chances");
				System.out.println("Re-enter the b value :- ");
				b = sc.nextInt();
			}
		}
	}
}