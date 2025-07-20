package java_programming;

import java.util.Scanner;

public class PalindromeNumber {
	public static int reverseNumber(int num) {
		int rev = 0;
		while(num>0) {
			int ld = num%10;
			rev = (rev*10)+ld;
			num = num/10;
		}
		return rev;
	}
	
	public static boolean isPalin(int num) {
		return reverseNumber(num) == num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a Number :- ");
		int num = sc.nextInt();
		
		if (isPalin(num))
			System.out.println(num+" is a Palindrome.");
	    else 
	    	System.out.println(num+" is not a Palindrome.");
		sc.close();
	}
}
