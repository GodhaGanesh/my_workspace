package java_programming;

import java.util.Scanner;

public class EndSumation {
	public static int firstDigitOf(int num) {
		int ld = 0;
		while(num>0) {
			ld = num%10;
			num = num/10;
		}
		return ld;
	}
	public static int lastDigitOf(int num) {
		return num%10;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a Number :- ");
		int num = sc.nextInt();
		
		int sumation = firstDigitOf(num)+lastDigitOf(num);
		System.out.println(sumation+" is the Sum of first & last digits of "+num+".");
	}
}
