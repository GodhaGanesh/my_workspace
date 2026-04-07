package exercise1;

import java.util.Scanner;

public class FebonacciGen {
	public static void febo(int n) {
		febGen(0,1,n);
	}
	public static void febGen(int i, int j, int n) {
		if(n <= 0) return;
		if(n == 1) {
			System.out.println(i+".");
			return;
		}
		System.out.print(i+", ");
		febGen(j, i + j, n - 1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to gen fibonacci series : ");
		febo(sc.nextInt());
		sc.close();
	}
}
