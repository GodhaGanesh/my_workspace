package java_programming;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean isPerfect(int num) {
		int sumOfFactors = 0;
		for(int i = 1;i<num;i++)
			if(num%i==0)
				sumOfFactors += i;
		return num == sumOfFactors;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a Number :- ");
		int num = sc.nextInt();
		
		String res = (isPerfect(num))?" is a Perfect Number.":" is not a Perfect Number.";
		System.out.println(num+res);
		sc.close();
	}
}
