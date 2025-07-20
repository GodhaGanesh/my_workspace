package java_programming;

import java.util.Scanner;

public class FebonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number :- ");
		int num = sc.nextInt();
		int fn = 0;
		int sn = 1;
		System.out.print("Febonacci Series : ");
		for(int i = 0;i<num;i++) {
			System.out.print(fn+", ");
			int temp = fn+sn;
			fn = sn;
			sn = temp;
		}
		sc.close();
	}
}
