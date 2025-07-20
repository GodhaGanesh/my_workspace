package java_programming;

import java.util.Scanner;

public class LargestDigitInANumber {
	public static int findLargestDigit(int num) {
		int max = 0;
		while(num>0) {
			if(num%10>max)
				max = num%10;
			num = num/10;
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a Number :- ");
		int num = sc.nextInt();
		System.out.println("the largest Digit in "+num+" is "+findLargestDigit(num));
		sc.close();
	}
}
