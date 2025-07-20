package java_programming;

import java.util.Scanner;

public class StrongNumber {
	
	public static boolean isStrong(int num) {
		int data = num;
		int res = 0;
		while(data>0) {
			res = res + findFactorial(data%10);
			data = data/10;
		}
		return res == num;
	}
	
	public static int findFactorial(int num) {
		int fact = 1;
		for(int i = num;i>1;i--)
			fact = fact *i;
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a Number :- ");
		int a = sc.nextInt();
		
		if (isStrong(a))
			System.out.println(a+" is Strong number");
		else
			System.out.println(a+" is not a Strong number");
		sc.close();
	}
}
