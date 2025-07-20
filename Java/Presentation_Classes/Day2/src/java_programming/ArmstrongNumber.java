package java_programming;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static int digitCount(int num) {
		int digitCount = 0;
		while(num>0) {
			num = num/10;
			digitCount++;
		}
		return digitCount;
	}
	
	public static boolean isArmStrong(int num) {
		int data = num;
		int sum = 0;
		int digitCount = digitCount(num);
		while(data>0) {
			int exp = 1;
			int ld  = data%10;
			for(int i = 0; i < digitCount; i++) {
				exp = exp*ld;
			}
			sum = sum+exp;
			data = data/10;
		}
		return sum == num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a Number :- ");
		int num = sc.nextInt();
		
		if (isArmStrong(num))
			System.out.println(num+" is a Armstrong Number.");
		else
			System.out.println(num+" is not a Armstrong Number.");
		sc.close();
	}
}
