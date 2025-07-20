package java_programming;

import java.util.Scanner;

public class NthSmallestInANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a Number :- ");
		int num = sc.nextInt();
		
	}
	
	public static int digitCount(int num) {
		int digitCount = 0;
		while(num>0) {
			num = num/10;
			digitCount++;
		}
		return digitCount;
	}
	
	public static int smallestDigit(int num, int n) {
		int[] digitArr = new int[digitCount(num)];
		for(int i = 0; i<digitArr.length; i++) {
			
		}
	}

}
